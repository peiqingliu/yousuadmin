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
 * @Date 2020-06-12 21:47
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_box_use_log_remarks")
public class KdgBoxUseLogRemarks {

    @Id
    private String blId =  String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String blRemarks;


}

