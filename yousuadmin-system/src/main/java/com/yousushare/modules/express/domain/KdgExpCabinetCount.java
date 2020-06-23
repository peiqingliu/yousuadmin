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
 * @Date 2020-06-12 22:15
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_exp_cabinet_count")
public class KdgExpCabinetCount {

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Date countDate;

    private String ecCode;

    private Integer deliveryCount;

    private Integer receiveCount;

}

