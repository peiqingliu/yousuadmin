package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgSysModelRepository;
import com.yousushare.modules.express.service.KdgSysModelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:28
 */
@AllArgsConstructor
@Service
public class KdgSysModelServiceImpl implements KdgSysModelService {
    private KdgSysModelRepository kdgSysModelRepository;
    @Override
    public KdgSysModelRepository getRepository() {
        return kdgSysModelRepository;
    }
}

