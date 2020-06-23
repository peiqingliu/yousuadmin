package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.base.BaseDao;
import com.yousushare.modules.express.domain.KdgUserLog;
import com.yousushare.modules.express.repository.KdgUserLogRepository;
import com.yousushare.modules.express.service.KdgUserLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:39
 */
@Service
@AllArgsConstructor
public class KdgUserLogServiceImpl implements KdgUserLogService {
    private KdgUserLogRepository kdgUserLogRepository;
    @Override
    public KdgUserLogRepository getRepository() {
        return kdgUserLogRepository;
    }
}

