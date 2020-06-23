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
 * @Date 2020-06-15 21:32
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_key_value")
public class KdgKeyValue {

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());;

    private String kvTableName;

    private String kvDate;

}

