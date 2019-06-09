package com.ten.aditum.collector.mysql2hdfs;

import com.ten.aditum.collector.constants.HadoopConstants;
import com.ten.aditum.collector.constants.MysqlConstants;
import lombok.extern.slf4j.Slf4j;
import org.apache.hadoop.conf.Configuration;
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
public class MysqlToHdfsJob {

    /**
     * 每天0点迁移mysql数据到hdfs
     */
    @Scheduled(cron = "0 0 0 1/1 * ?")
    public void migrate() {
        Long start = System.currentTimeMillis();
        log.info("MysqlToHdfs开始同步");
        try {
            importDataFromMysql();
            long duration = System.currentTimeMillis() - start;
            log.info("MysqlToHdfs同步结束 duration:{}", duration);
        } catch (Exception e) {
            long duration = System.currentTimeMillis() - start;
            log.error("MysqlToHdfs同步异常 duration:{} exce:{}", duration, e);
        }
    }

    private void importDataFromMysql() throws Exception {
        Configuration conf = new Configuration();
        conf.set(HadoopConstants.HDFS_NAME, HadoopConstants.HDFS_VALUE);
        SqoopTool tool = SqoopTool.getTool("import");
        Configuration loadPlugins = SqoopTool.loadPlugins(conf);
        Sqoop sqoop = new Sqoop((com.cloudera.sqoop.tool.SqoopTool) tool, loadPlugins);
        for (String table : MysqlConstants.TABLES) {
            String[] args = new String[]{
                    "--connect", MysqlConstants.CONNECT,
                    "--driver", MysqlConstants.DRIVER,
                    "--username", MysqlConstants.USERNAME,
                    "--password", MysqlConstants.PASSWORD,
                    "--table", table,
                    "--delete-target-dir",
                    "--num-mappers", "1",
                    "--target-dir", "/aditum/" + table
            };
            Long start = System.currentTimeMillis();
            log.info("MysqlToHdfs开始同步 table:{}", table);
            String[] expandArguments = OptionsFileUtil.expandArguments(args);
            int res = Sqoop.runSqoop(sqoop, expandArguments);
            long duration = System.currentTimeMillis() - start;
            if (res == 0) {
                log.info("MysqlToHdfs同步成功 table:{} duration:{}", table, duration);
            } else {
                log.warn("MysqlToHdfs同步失败 table:{} duration:{}", table, duration);
            }
        }
    }

}
