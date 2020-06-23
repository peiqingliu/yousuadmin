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
 * @Date 2020-06-15 22:24
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_sys_model")
public class KdgSysModel {

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Integer mId;

    private String mName;

    private Integer mParent;

    private String mPath;

    private Integer mMenu;

    private Integer mPower;

    private Integer mUse;

    private Integer mSort;
}

