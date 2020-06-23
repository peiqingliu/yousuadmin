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
 * @Date 2020-06-15 22:41
 */
@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_users")
public class KdgUsers {

    @Id
    private String uId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String uName;

    private String uPwd;

    private Integer uGroup;

    private Integer uUse;

    private String uKey;

    private Integer uDelivery;

    private String uPhone;

    private Date uListDeliveryDate;

    private Integer uDeliveryKey;

    private String blId;

    private Date uCreateDate;

    private String uIdCardNo;

    private Date uListOpenBoxDate;

    private Integer uOpenBoxKey;

    private String uFullName;

    private Integer uPwdExpire;

    private Integer uDelete;

    private Integer lastUserId;

    private String lastUserName;

    private Date lastDate;
}

