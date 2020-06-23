package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgHousingEstateRepository;
import com.yousushare.modules.express.service.KdgHousingEstateService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:21
 */
@AllArgsConstructor
@Slf4j
@Service
public class KdgHousingEstateServiceImpl implements KdgHousingEstateService {

    private KdgHousingEstateRepository kdgHousingEstateRepository;
    @Override
    public KdgHousingEstateRepository getRepository() {
        return kdgHousingEstateRepository;
    }
}

