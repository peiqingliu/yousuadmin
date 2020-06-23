package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgOpenBoxLogRepository;
import com.yousushare.modules.express.service.KdgOpenBoxLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:46
 */
@Service
@AllArgsConstructor
public class KdgOpenBoxLogServiceImpl implements KdgOpenBoxLogService {
    private KdgOpenBoxLogRepository kdgOpenBoxLogRepository;
    @Override
    public KdgOpenBoxLogRepository getRepository() {
        return kdgOpenBoxLogRepository;
    }
}

