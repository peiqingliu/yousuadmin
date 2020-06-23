package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgSystemLogRepository;
import com.yousushare.modules.express.service.KdgSystemLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:32
 */
@AllArgsConstructor
@Service
public class KdgSystemLogServiceImpl implements KdgSystemLogService {
    private KdgSystemLogRepository kdgSystemLogRepository;
    @Override
    public KdgSystemLogRepository getRepository() {
        return kdgSystemLogRepository;
    }
}

