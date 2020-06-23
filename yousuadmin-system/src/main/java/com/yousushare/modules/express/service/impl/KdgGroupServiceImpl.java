package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgGroupRepository;
import com.yousushare.modules.express.service.KdgGroupService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:15
 */
@Service
@AllArgsConstructor
public class KdgGroupServiceImpl implements KdgGroupService {
    private KdgGroupRepository kdgGroupRepository;
    @Override
    public KdgGroupRepository getRepository() {
        return kdgGroupRepository;
    }
}

