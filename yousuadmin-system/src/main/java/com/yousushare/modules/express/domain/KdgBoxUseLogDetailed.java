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
 * @Date 2020-06-11 21:57
 */

@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_box_use_log_detailed")
public class KdgBoxUseLogDetailed {

    @Id
    private String id =  String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String blId;

    private Integer blNum;

    private Integer blState;

    private Date blDate;
}

