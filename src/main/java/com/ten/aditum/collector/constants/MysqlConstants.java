package com.ten.aditum.collector.constants;

public interface MysqlConstants {

    String CONNECT = "jdbc:mysql://47.100.236.64:3306/aditum";

    String DRIVER = "com.mysql.cj.jdbc.Driver";

    String USERNAME = "root";

    String PASSWORD = "wangshihao";

    String[] TABLES = new String[]{
            "community",
            "device",
            "person",
            "record",
            "access_address",
            "access_interval",
            "access_time",
            "device_access_count",
            "device_access_heat",
            "device_access_log",
            "device_access_total",
            "personas_label",
            "personas_portrait"
    };

}
