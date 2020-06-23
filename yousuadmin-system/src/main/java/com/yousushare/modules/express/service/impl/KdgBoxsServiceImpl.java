package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgBoxsRepository;
import com.yousushare.modules.express.service.KdgBoxsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:29
 */
@Service
@AllArgsConstructor
public class KdgBoxsServiceImpl implements KdgBoxsService {

    private KdgBoxsRepository kdgBoxsRepository;

    @Override
    public KdgBoxsRepository getRepository() {
        return kdgBoxsRepository;
    }
}

