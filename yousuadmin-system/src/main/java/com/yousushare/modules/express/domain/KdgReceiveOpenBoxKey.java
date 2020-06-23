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
 * @Date 2020-06-15 21:54
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_receive_open_box_key")
public class KdgReceiveOpenBoxKey {

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private Date rkDate;

    private Integer rkKey;
}

