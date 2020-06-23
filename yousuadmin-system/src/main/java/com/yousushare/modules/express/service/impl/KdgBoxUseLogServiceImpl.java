package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgBoxUseLogRepository;
import com.yousushare.modules.express.service.KdgBoxUseLogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:54
 */
@Service
@AllArgsConstructor
public class KdgBoxUseLogServiceImpl implements KdgBoxUseLogService {

    private KdgBoxUseLogRepository kdgBoxUseLogRepository;

    @Override
    public KdgBoxUseLogRepository getRepository() {
        return kdgBoxUseLogRepository;
    }
}

