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
 * @Date 2020-06-12 22:23
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_exp_cabinet_key")
public class KdgExpCabinetKey {

    @Id
    private String kId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String kName;

}

