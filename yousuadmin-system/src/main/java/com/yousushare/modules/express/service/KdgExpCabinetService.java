package com.yousushare.modules.express.service;

import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgExpCabinet;
import com.yousushare.modules.express.service.dto.CabinetQueryCriteria;
import org.springframework.data.domain.Pageable;

import java.util.Map;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 22:03
 */
public interface KdgExpCabinetService extends BaseService<KdgExpCabinet,String> {

    /**
     * 分页查询
     * @param criteria 条件
     * @param pageable 分页参数
     * @return /
     */
    Map<String,Object> queryAll(CabinetQueryCriteria criteria, Pageable pageable);

}
