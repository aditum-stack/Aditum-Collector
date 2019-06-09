package com.ten.aditum.collector.constants;

public interface SqoopConstants {

    String[] FLUME_LOG_PATHS = new String[]{
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-01.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-02.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-03.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-04.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-05.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-06.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-07.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-08.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-09.log hdfs://localhost:9000/aditum_log/flume",
            "D:\\Hadoop\\hadoop-2.7.7\\bin\\hadoop.cmd fs -put -f D:\\logs\\AditumBack.log.2019-06-10.log hdfs://localhost:9000/aditum_log/flume",
    };

}
