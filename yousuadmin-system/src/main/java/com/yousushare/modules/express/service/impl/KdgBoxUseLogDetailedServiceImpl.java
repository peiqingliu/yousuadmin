package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgBoxUseLogDetailedRepository;
import com.yousushare.modules.express.service.KdgBoxUseLogDetailedService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 22:05
 */
@Service
@AllArgsConstructor
public class KdgBoxUseLogDetailedServiceImpl implements KdgBoxUseLogDetailedService {

    private KdgBoxUseLogDetailedRepository kdgBoxUseLogDetailedRepository;
    @Override
    public KdgBoxUseLogDetailedRepository getRepository() {
        return kdgBoxUseLogDetailedRepository;
    }
}

