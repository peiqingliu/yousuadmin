package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgFilterPhoneDetailedRepository;
import com.yousushare.modules.express.service.KdgFilterPhoneDetailedService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-13 21:52
 */
@AllArgsConstructor
@Service
public class KdgFilterPhoneDetailedServiceImpl implements KdgFilterPhoneDetailedService {

    private KdgFilterPhoneDetailedRepository kdgFilterPhoneDetailedRepository;
    @Override
    public KdgFilterPhoneDetailedRepository getRepository() {
        return kdgFilterPhoneDetailedRepository;
    }
}

