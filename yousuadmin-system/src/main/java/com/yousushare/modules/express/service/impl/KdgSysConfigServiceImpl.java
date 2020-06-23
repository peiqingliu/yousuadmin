package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgSysConfigRepository;
import com.yousushare.modules.express.service.KdgSysConfigService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:21
 */
@AllArgsConstructor
@Service
public class KdgSysConfigServiceImpl implements KdgSysConfigService {
    private KdgSysConfigRepository kdgSysConfigRepository;
    @Override
    public KdgSysConfigRepository getRepository() {
        return kdgSysConfigRepository;
    }
}

