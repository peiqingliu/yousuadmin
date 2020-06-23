package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgBoxUseLogRemarksRepository;
import com.yousushare.modules.express.service.KdgBoxUseLogRemarksService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 21:50
 */
@Service
@AllArgsConstructor
@Slf4j
public class KdgBoxUseLogRemarksServiceImpl implements KdgBoxUseLogRemarksService {

    private KdgBoxUseLogRemarksRepository kdgBoxUseLogRemarksRepository;

    @Override
    public KdgBoxUseLogRemarksRepository getRepository() {
        return kdgBoxUseLogRemarksRepository;
    }
}

