package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgServiceProviderRepository;
import com.yousushare.modules.express.service.KdgServiceProviderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:15
 */
@AllArgsConstructor
@Service
public class KdgServiceProviderServiceImpl implements KdgServiceProviderService {
    private KdgServiceProviderRepository kdgServiceProviderRepository;
    @Override
    public KdgServiceProviderRepository getRepository() {
        return kdgServiceProviderRepository;
    }
}

