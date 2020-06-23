package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgExpCabinetKeyRepository;
import com.yousushare.modules.express.service.KdgExpCabinetKeyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 22:25
 */
@Service
@AllArgsConstructor
public class KdgExpCabinetKeyServiceImpl implements KdgExpCabinetKeyService {

    private KdgExpCabinetKeyRepository kdgExpCabinetKeyRepository;

    @Override
    public KdgExpCabinetKeyRepository getRepository() {
        return kdgExpCabinetKeyRepository;
    }
}

