package com.ten.aditum.collector.util;

import com.ten.aditum.collector.constants.HadoopConstants;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;

import java.io.IOException;
import java.util.Map;
import java.util.NavigableMap;

/**
 * HBase工具类
 */
public class HBaseUtil {
    /**
     * 获得连接
     */
    public static Connection getConnection() throws IOException {
        Configuration conf = HBaseConfiguration.create();
        conf.set(HadoopConstants.HBASE_CONFIGURATION_ZOOKEEPER_QUORUM, HadoopConstants.HBASE_CONFIGURATION_ZOOKEEPER_QUORUM, HadoopConstants.HBASE_ZOOKEEPER_QUORUM);
        conf.set(HadoopConstants.HBASE_CONFIGURATION_ZOOKEEPER_CLIENTPORT, String.valueOf(HadoopConstants.HBASE_ZOOKEEPER_CLIENT_PORT));
        return ConnectionFactory.createConnection(conf);
    }

    /**
     * 创建表
     */
    public static void createTable(Connection connection, String tableNameString, String columnFamily) throws IOException {
        Admin admin = connection.getAdmin();
        TableName tableName = TableName.valueOf(tableNameString); //d2h (data to HBase)
        HTableDescriptor table = new HTableDescriptor(tableName);
        HColumnDescriptor family = new HColumnDescriptor(columnFamily);
        table.addFamily(family);
        //判断表是否已经存在
        if (admin.tableExists(tableName)) {
            admin.disableTable(tableName);
            admin.deleteTable(tableName);
        }
        admin.createTable(table);
    }

    /**
     * 获取插入HBase的操作put
     */
    public static Put createPut(String rowKeyString, byte[] familyName, String columnName, String columnValue) {
        byte[] rowKey = rowKeyString.getBytes();
        Put put = new Put(rowKey);
        put.addColumn(familyName, columnName.getBytes(), columnValue.getBytes());
        return put;
    }

    /**
     * 打印HBase查询结果
     */
    public static void print(Result result) {
        //result是个四元组<行键，列族，列(标记符)，值>
        byte[] row = result.getRow(); //行键
        NavigableMap<byte[], NavigableMap<byte[], NavigableMap<Long, byte[]>>> map = result.getMap();
        for (Map.Entry<byte[], NavigableMap<byte[], NavigableMap<Long, byte[]>>> familyEntry : map.entrySet()) {
            byte[] familyBytes = familyEntry.getKey(); //列族
            for (Map.Entry<byte[], NavigableMap<Long, byte[]>> entry : familyEntry.getValue().entrySet()) {
                byte[] column = entry.getKey(); //列
                for (Map.Entry<Long, byte[]> longEntry : entry.getValue().entrySet()) {
                    Long time = longEntry.getKey(); //时间戳
                    byte[] value = longEntry.getValue(); //值
                    System.out.println(String.format("行键rowKey=%s,列族columnFamily=%s,列column=%s,时间戳timestamp=%d,值value=%s", new String(row), new String(familyBytes), new String(column), time, new String(value)));
                }
            }
        }

    }
}
