package com.ten.aditum.collector.mysql2hbase;

import com.ten.aditum.collector.constants.HadoopConstants;
import com.ten.aditum.collector.constants.MysqlConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.sqoop.Sqoop;
import org.apache.sqoop.tool.SqoopTool;
import org.apache.sqoop.util.OptionsFileUtil;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableScheduling
@EnableAutoConfiguration
public class MysqlToHbaseSqoopJob {

//    @Scheduled(cron = "0 41/59 * * * ? ")

    /**
     * 每天0点迁移mysql数据到hdfs
     */
    @Scheduled(cron = "0 0 0 1/1 * ?")
    public void migrate() {
        Long start = System.currentTimeMillis();
        log.info("MysqlToHbase开始同步");
        try {
            importDataFromMysql();
            long duration = System.currentTimeMillis() - start;
            log.info("MysqlToHbase同步结束 duration:{}", duration);
        } catch (Exception e) {
            long duration = System.currentTimeMillis() - start;
            log.error("MysqlToHbase同步异常 duration:{} exce:{}", duration, e);
        }
    }


    private void importDataFromMysql() throws Exception {
        Configuration conf = new Configuration();
        conf.set(HadoopConstants.HDFS_NAME, HadoopConstants.HDFS_VALUE);

        Configuration hConf = HBaseConfiguration.create(conf);
        hConf.set(HadoopConstants.HBASE_CONFIGURATION_ZOOKEEPER_QUORUM, HadoopConstants.HBASE_ZOOKEEPER_QUORUM);
        hConf.setInt(HadoopConstants.HBASE_CONFIGURATION_ZOOKEEPER_CLIENTPORT, HadoopConstants.HBASE_ZOOKEEPER_CLIENT_PORT);

        SqoopTool tool = SqoopTool.getTool("import");
        Configuration loadPlugins = SqoopTool.loadPlugins(hConf);
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
        for (String table : MysqlConstants.TABLES) {
            String[] args = new String[]{
                    "--connect", MysqlConstants.CONNECT,
                    "--driver", MysqlConstants.DRIVER,
                    "--username", MysqlConstants.USERNAME,
                    "--password", MysqlConstants.PASSWORD,
                    "--table", table,
                    "--hbase-row-key", "id",
                    "--column-family", "region",
                    "--hbase-table", "H" + table,
                    "--hbase-create-table"
            };

            Long start = System.currentTimeMillis();
            log.info("MysqlToHbase开始同步 table:{}", table);
            String[] expandArguments = OptionsFileUtil.expandArguments(args);
            int res = Sqoop.runSqoop(sqoop, expandArguments);
            long duration = System.currentTimeMillis() - start;
            if (res == 0) {
                log.info("MysqlToHbase同步成功 table:{} duration:{}", table, duration);
            } else {
                log.warn("MysqlToHbase同步失败 table:{} duration:{}", table, duration);
            }
        }
    }

}
