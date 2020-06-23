package com.yousushare.modules.express.service.dto;

import com.yousushare.annotation.Query;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-22 22:34
 */
@AllArgsConstructor
@Data
public class CabinetQueryCriteria {


    @Query(type = Query.Type.INNER_LIKE)
    private String ecAlias;
    

    @Query(type = Query.Type.BETWEEN)
    private List<Timestamp> createTime;
}

