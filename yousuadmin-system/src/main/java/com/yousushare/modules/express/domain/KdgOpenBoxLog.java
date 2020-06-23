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
 * @Date 2020-06-15 21:43
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_open_box_log")
public class KdgOpenBoxLog {

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String millis;

    private String uPhone;


    private Date obDate;

    private Integer ecId;

    private Integer elId;

    private Integer boxId;

    private String boxAlias;

    private Integer obType;

    private Integer uId;

    private String typeName;
}

