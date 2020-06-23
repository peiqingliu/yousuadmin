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
 * @Date 2020-06-15 22:12
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_service_provider")
public class KdgServiceProvider {


    @Id
    private String spId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String spName;


}

