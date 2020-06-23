package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgReceiveOpenBoxKeyRepository;
import com.yousushare.modules.express.service.KdgReceiveOpenBoxKeyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:56
 */
@Service
@AllArgsConstructor
public class KdgReceiveOpenBoxKeyServiceImpl implements KdgReceiveOpenBoxKeyService {
    private KdgReceiveOpenBoxKeyRepository kdgReceiveOpenBoxKeyRepository;
    @Override
    public KdgReceiveOpenBoxKeyRepository getRepository() {
        return kdgReceiveOpenBoxKeyRepository;
    }
}

