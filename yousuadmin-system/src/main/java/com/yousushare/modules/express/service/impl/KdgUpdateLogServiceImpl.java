package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgUpdateLogRepository;
import com.yousushare.modules.express.service.KdgUpdateLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:36
 */
@Service
@AllArgsConstructor
public class KdgUpdateLogServiceImpl implements KdgUpdateLogService {
    private KdgUpdateLogRepository kdgUpdateLogRepository;
    @Override
    public KdgUpdateLogRepository getRepository() {
        return kdgUpdateLogRepository;
    }
}

