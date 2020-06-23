package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgRoleRepository;
import com.yousushare.modules.express.service.KdgRoleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:01
 */
@AllArgsConstructor
@Service
public class KdgRoleServiceImpl implements KdgRoleService {
    private KdgRoleRepository kdgRoleRepository;
    @Override
    public KdgRoleRepository getRepository() {
        return kdgRoleRepository;
    }
}

