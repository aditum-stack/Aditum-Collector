package com.ten.aditum.collector.util;

import com.ten.aditum.collector.constants.MysqlConstants;

import java.sql.*;
import java.util.ArrayList;

/**
 * 连接mysql
 */
public class JdbcUtil {

    /**
     * 获得mysql连接
     */
    public static Connection getConnection() throws Exception {
        //注册驱动
        Class.forName(MysqlConstants.DRIVER);
        String url = MysqlConstants.CONNECT;
        String user = MysqlConstants.USERNAME;
        String password = MysqlConstants.PASSWORD;
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 获取Mysql中所有表及视图的名称
     */
    public static ArrayList<String> getTableNames(Connection connection) throws SQLException {
        //获得数据库的元数据
        DatabaseMetaData metaData = connection.getMetaData();
        //获得表与视图
        ResultSet tables = metaData.getTables(null, null, null, new String[]{"TABLE"});
        ArrayList<String> tableNames = new ArrayList<>();
        //遍历ResultSet
        while (tables.next()) {
            tableNames.add(tables.getString(3)); //表名及视图名在第3个位置
        }
        return tableNames;
    }
}
