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
 * @Date 2020-06-15 22:34
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_update_log")
public class KdgUpdateLog {

    @Id
    private String updateId =String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Integer updateType;

    private String outValue;

    private String newValue;

    private Date updateDate;

    private String updateDescribe;

    private String blId;
}

