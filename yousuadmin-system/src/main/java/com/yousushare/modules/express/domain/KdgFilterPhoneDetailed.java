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
 * @Date 2020-06-13 21:41
 */

@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_filter_phone_detailed")
public class KdgFilterPhoneDetailed {

    @Id
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String fdFilterPhone;

    private Integer fdIndex;

    private Integer fdUse;

    private Date fdDate;

    private Integer fdUserId;

    private String fdUserName;

    private String fdMessage;

}

