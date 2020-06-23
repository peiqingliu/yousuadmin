package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.domain.KdgExpCabinet;
import com.yousushare.modules.express.repository.KdgExpCabinetRepository;
import com.yousushare.modules.express.service.KdgExpCabinetService;
import com.yousushare.modules.express.service.dto.CabinetQueryCriteria;
import com.yousushare.modules.system.domain.Job;
import com.yousushare.utils.QueryHelp;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 22:03
 */
@Service
@AllArgsConstructor
public class KdgExpCabinetServiceImpl implements KdgExpCabinetService {

    private KdgExpCabinetRepository kdgExpCabinetRepository;

    @Override
    public KdgExpCabinetRepository getRepository() {
        return kdgExpCabinetRepository;
    }

    @Override
    public Map<String, Object> queryAll(CabinetQueryCriteria criteria, Pageable pageable) {
        Page<KdgExpCabinet> page = kdgExpCabinetRepository.findAll((root, criteriaQuery, criteriaBuilder) -> QueryHelp.getPredicate(root,criteria,criteriaBuilder),pageable);
        return null;
    }
}

