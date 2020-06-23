package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgKeyValueRepository;
import com.yousushare.modules.express.service.KdgKeyValueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:35
 */
@Service
@AllArgsConstructor
public class KdgKeyValueServiceImpl implements KdgKeyValueService {
    private KdgKeyValueRepository kdgKeyValueRepository;
    @Override
    public KdgKeyValueRepository getRepository() {
        return kdgKeyValueRepository;
    }
}

