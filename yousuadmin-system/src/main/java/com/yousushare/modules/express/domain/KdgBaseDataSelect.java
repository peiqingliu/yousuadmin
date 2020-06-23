package com.yousushare.modules.express.domain;

import com.yousushare.utils.SnowFlakeUtil;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Slf4j
@Data
@ToString
@Entity
@Table(name = "kdg_base_data_select")
public class KdgBaseDataSelect {

    private static final long serialVersionUID = 1L;

    @Id
    private String bId = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    private String bName;

    private String bColumn;

    private String bRemarks;

}
