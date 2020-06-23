package com.yousushare.modules.express.domain;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-13 21:36
 */

@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_filter_phone")
public class KdgFilterPhone {

    @Id
    private String fuUserPhone;

    private Integer fuUse;

    private Date fuCreateDate;

    private Date fuListDate;

    private String fuMessage;

    private Integer fuIndex;
}

