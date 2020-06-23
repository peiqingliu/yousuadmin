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
 * @Date 2020-06-15 21:37
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_not_query_open_box")
public class KdgNotQueryOpenBox {

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String ecCode;

    private Integer elCode;

    private Integer boxCode;

    private String ecAlias;

    private String boxAlias;

    private Integer handle;

    private Date fdate;

    private Integer handleuserid;

    private String handleusername;

    private Date handledate;
}

