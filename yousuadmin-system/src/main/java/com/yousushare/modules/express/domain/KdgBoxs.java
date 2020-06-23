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
 * @Date 2020-06-10 22:47
 * 快递柜
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_boxs")
public class KdgBoxs {

    private static final long serialVersionUID = 1L;

    @Id
    private String cId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Integer elId;

    private Integer ecId;

    private Integer cBoxCode;

    private String cBoxAlias;

    private Integer cBoxType;

    private Integer cBoxEnable;

    private Date cBoxLastActiveTime;

    private Integer cRequest;

    private Integer cDelivery;

    private Integer cDeliveryUserId;

    private Date cDeliveryDate;

    private String cReceivePhone;

    private String cReceiveKey;

    private String cMailnum;

    private String blId;

    private Integer cRequestUserId;

    private Date cRequestDate;

    private Date cReceiveDate;

    private Integer cReceiveType;

    private Integer cReceiveOpenBox;

    private Integer cReceiveOpenBoxStateFeedback;

    private String cRequestUserPhone;

    private Integer lastUserId;

    private String lastUserName;

    private Date lastDate;

    private String cRemark;
}

