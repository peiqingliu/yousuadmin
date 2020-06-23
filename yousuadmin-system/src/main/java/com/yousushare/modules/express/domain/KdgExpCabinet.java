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
 * @Date 2020-06-12 21:59
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_exp_cabinet")
public class KdgExpCabinet {

    @Id
    private String ecId  =  String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String ecCode;

    private Integer ecKey;

    private Integer ecDelete;

    private String ecAddress;

    private String ecAlias;

    private Integer ecServiceProviderId;

    private Integer ecHousingestateId;

    private Integer parentId;

    private Integer ecTemporarily;

    private String ecMsg;

    private Integer lastUserId;

    private String lastUserName;

    private Date lastDate;

    private String ecPhone;
}

