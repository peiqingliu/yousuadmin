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
 * @Date 2020-06-15 22:37
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_user_log")
public class KdgUserLog {

    @Id
    private String lId =String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Integer uId;

    private String uName;

    private Date lDate;

    private String lMsg;

    private Integer lServiceId;

    private String lServiceName;
}

