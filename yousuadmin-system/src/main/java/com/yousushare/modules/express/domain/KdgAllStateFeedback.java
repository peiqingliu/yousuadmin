package com.yousushare.modules.express.domain;

import com.yousushare.utils.SnowFlakeUtil;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

/**
 * kdg客户端状态反馈
 *
 * 所有客户端连接信息
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_all_state_feedback")
public class KdgAllStateFeedback {

    private static final long serialVersionUID = 1L;

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());


    private String sfIp;

    private String sfCurrentTimeMillis;

    private Integer elCode;

    private Integer boxCode;

    private Integer sfType;

    private Integer sfState;

    private Date sfDate;

    private String ecId;
}
