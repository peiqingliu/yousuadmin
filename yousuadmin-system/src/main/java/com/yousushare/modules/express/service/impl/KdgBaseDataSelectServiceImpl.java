package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgBaseDataSelectRepository;
import com.yousushare.modules.express.service.KdgBaseDataSelectService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-10 22:41
 */
@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class KdgBaseDataSelectServiceImpl implements KdgBaseDataSelectService {

    private KdgBaseDataSelectRepository kdgBaseDataSelectRepository;

    @Override
    public KdgBaseDataSelectRepository getRepository() {
        return kdgBaseDataSelectRepository;
    }
}

