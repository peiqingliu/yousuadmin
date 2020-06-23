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
 * @Date 2020-06-15 21:58
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_role")
public class KdgRole {

    @Id
    private String rId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());


    private String rName;

    private Integer rDelete;

    private Integer lastUserId;

    private String lastUserName;

    private Date lastDate;
}

