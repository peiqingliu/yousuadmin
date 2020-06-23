package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgRolePowerRepository;
import com.yousushare.modules.express.service.KdgRolePowerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:06
 */
@AllArgsConstructor
@Service
public class KdgRolePowerServiceImpl implements KdgRolePowerService {
    private KdgRolePowerRepository kdgRolePowerRepository;
    @Override
    public KdgRolePowerRepository getRepository() {
        return kdgRolePowerRepository;
    }
}

