package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgCityRepository;
import com.yousushare.modules.express.service.KdgCityService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 21:57
 */
@Service
@AllArgsConstructor
public class KdgCityServiceImpl implements KdgCityService {

    private KdgCityRepository kdgCityRepository;

    @Override
    public KdgCityRepository getRepository() {
        return kdgCityRepository;
    }
}

