package com.yousushare.modules.express.domain;

import com.yousushare.utils.SnowFlakeUtil;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:30
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_system_log")
public class KdgSystemLog {

    @Id
    private String logId =  String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Integer logLevel;

    private String logMsg;

    private Date logDate;
}

