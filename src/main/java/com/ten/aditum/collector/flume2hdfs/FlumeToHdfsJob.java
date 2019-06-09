package com.ten.aditum.collector.flume2hdfs;

import com.ten.aditum.collector.constants.ScheduleConstants;
import com.ten.aditum.collector.constants.SqoopConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Component
@EnableScheduling
@EnableAutoConfiguration
public class FlumeToHdfsJob {

    /**
     * 每天1点迁移flume数据到hdfs
     */
    @Scheduled(cron = ScheduleConstants.TIME)
    public void migrate() {
        Long start = System.currentTimeMillis();
        log.info("FlumeToHdfs开始同步");
        try {
            importDataFromFlume();
            long duration = System.currentTimeMillis() - start;
            log.info("FlumeToHdfs同步结束 duration:{}", duration);
        } catch (Exception e) {
            long duration = System.currentTimeMillis() - start;
            log.error("FlumeToHdfs同步异常 duration:{} exce:{}", duration, e);
        }
    }

    private void importDataFromFlume() {
        for (String path : SqoopConstants.FLUME_LOG_PATHS) {
            try {
                Runtime.getRuntime().exec(path);
            } catch (IOException e) {
                e.printStackTrace();
                log.warn("FlumeToHdfs执行失败", e);
            }
        }
    }
}
