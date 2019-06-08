package com.ten.aditum.collector;

import org.apache.hadoop.conf.Configuration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.apache.sqoop.util.OptionsFileUtil;

public class SqoopTest {
    private static int importDataFromMysql() throws Exception {
        String[] args = new String[]{
                "--connect", "jdbc:mysql://47.100.236.64:3306/aditum",
                "--driver", "com.mysql.cj.jdbc.Driver",
                "--username", "root",
                "--password", "wangshihao",
                "--table", "community",
                "--delete-target-dir",
                "--num-mappers", "1",
                "--target-dir", "/aditum/community"
        };
        String[] expandArguments = OptionsFileUtil.expandArguments(args);

        SqoopTool tool = SqoopTool.getTool("import");
        Configuration conf = new Configuration();
        // 设置HDFS服务地址
        conf.set("fs.default.name", "hdfs://127.0.0.1:9000");
        Configuration loadPlugins = SqoopTool.loadPlugins(conf);
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
        return Sqoop.runSqoop(sqoop, expandArguments);
    }

    public static void main(String[] args) throws Exception {
        Long t1 = System.currentTimeMillis();
        importDataFromMysql();
        System.out.println(System.currentTimeMillis() - t1);
    }
}
