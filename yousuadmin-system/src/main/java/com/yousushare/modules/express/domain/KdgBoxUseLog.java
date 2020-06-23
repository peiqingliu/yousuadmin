package com.yousushare.modules.express.domain;

import com.yousushare.utils.SnowFlakeUtil;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:51
 * 快递柜使用日志
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_box_use_log")
public class KdgBoxUseLog {

    @Id
    private String blId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Integer elId;

    private Integer ecId;

    private Integer cId;

    private Integer uId;

    private String uPhone;

    private String cReceivePhone;

    private String cReceiveKey;

    private String cMailnum;

    private Integer blNum;

    private Integer blState;

    private String cReplaceUserPhone;

    private String ecAlias;

    private String boxAlias;

}

