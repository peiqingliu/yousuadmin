package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgProvinceRepository;
import com.yousushare.modules.express.service.KdgProvinceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:50
 */
@Service
@AllArgsConstructor
public class KdgProvinceServiceImpl implements KdgProvinceService {

    private KdgProvinceRepository kdgProvinceRepository;

    @Override
    public KdgProvinceRepository getRepository() {
        return kdgProvinceRepository;
    }
}

