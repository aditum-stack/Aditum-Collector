package com.ten.aditum.collector.mysql2hbase;

import com.ten.aditum.collector.constants.ScheduleConstants;
import com.ten.aditum.collector.util.HBaseUtil;
import com.ten.aditum.collector.util.JdbcUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 将Mysql某一数据库中的所有表及视图迁移至HBase
 * <p>
 * 从Mysql导入到HBase中，可以实现一对一，也可以实现多对一
 * 多对一的情况出现在关联查询非常多的情况下
 * <p>
 * 实现多对一的方法：
 * 在HBase中，1、一个Mysql表对应一个列族；2、所有表的字段都作为列族的列存在
 * 在Mysql中，建立一个视图，转化为一对一的实现方式
 */
@Slf4j
@Component
@EnableScheduling
@EnableAutoConfiguration
public class MysqlToHbaseJob {

    /**
     * 每天1点迁移mysql数据到hbase
     */
    @Scheduled(cron = ScheduleConstants.TIME)
    public void migrate() throws Exception {
        Connection connection = JdbcUtil.getConnection();
        ArrayList<String> tableNames = JdbcUtil.getTableNames(connection);
        org.apache.hadoop.hbase.client.Connection hbaseConn = HBaseUtil.getConnection();
        String familyName = "mx_fn";
        String nameSpace = "mx_ns:";

        for (String tableName : tableNames) {
            HBaseUtil.createTable(hbaseConn, nameSpace + tableName, familyName);
        }
        for (String tableName : tableNames) {
            Statement statement = connection.createStatement();
            String sql = "select * from " + tableName;
            ResultSet resultSet = statement.executeQuery(sql);
            List<String> columnNames = getColumnName(resultSet);
            List<ArrayList<String>> allRows = getAllRow(resultSet, columnNames);
            List<Put> puts = createPutList(familyName, columnNames, allRows);
            insertData(hbaseConn, nameSpace + tableName, puts);
        }
        connection.close();
        hbaseConn.close();
    }

    /**
     * 插入数据至HBase中
     */
    private static void insertData(org.apache.hadoop.hbase.client.Connection hbaseConn, String s, List<Put> puts) throws IOException {
        Table table = hbaseConn.getTable(TableName.valueOf(s));
        table.put(puts);
        table.close();
    }

    /**
     * 创建Put列表
     */
    private static List<Put> createPutList(String familyName, List<String> columnNames, List<ArrayList<String>> allRows) {
        ArrayList<Put> puts = new ArrayList<>();
        for (ArrayList<String> row : allRows) {
            int size = row.size();
            String rowKeyString = row.get(0);
            for (int i = 1; i < size; i++) {
                String columnName = columnNames.get(i);
                String columnValue = row.get(i);
                if (columnValue != null) {
                    Put put = HBaseUtil.createPut(rowKeyString, familyName.getBytes(), columnName, columnValue);
                    puts.add(put);
                }
            }
        }
        return puts;
    }

    /**
     * 读取MySQL某张表的数据
     */
    private static List<ArrayList<String>> getAllRow(ResultSet resultSet, List<String> columnNames) throws SQLException {
        ArrayList<ArrayList<String>> allRows = new ArrayList<>();
        while (resultSet.next()) {
            ArrayList<String> row = new ArrayList<>();
            for (String columnName : columnNames) {
                Object value = resultSet.getObject(columnName);
                row.add(value == null ? null : value.toString());
            }
            allRows.add(row);
        }
        return allRows;
    }

    /**
     * 获取表的列名
     */
    private static List<String> getColumnName(ResultSet resultSet) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        List<String> columnNames = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            columnNames.add(metaData.getColumnName(i));
        }
        return columnNames;
    }

}
