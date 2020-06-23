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
 * @Date 2020-06-11 21:38
 * 快递柜使用情况
 */

@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_box_use_list")
public class KdgBoxUseList {

    @Id
    private String buId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Integer ecId;

    private Integer elId;

    private Integer cId;

    private Integer uId;

    private String buMailnum;

    private Date buRequestDate;

    private Date buDeliveryDate;

    private String buPickupPhone;

    private String buPickupKey;

    private Byte buReceive;

    private Date buReceiveDate;

    private Byte buCancel;

    private Date buCancelDate;
}

