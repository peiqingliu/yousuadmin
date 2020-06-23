package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgNotQueryOpenBoxRepository;
import com.yousushare.modules.express.service.KdgNotQueryOpenBoxService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:41
 */
@AllArgsConstructor
@Service
public class KdgNotQueryOpenBoxServiceImpl implements KdgNotQueryOpenBoxService {
    private KdgNotQueryOpenBoxRepository kdgNotQueryOpenBoxRepository;
    @Override
    public KdgNotQueryOpenBoxRepository getRepository() {
        return kdgNotQueryOpenBoxRepository;
    }
}

