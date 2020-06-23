package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgExpCabinetCountRepository;
import com.yousushare.modules.express.service.KdgExpCabinetCountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 22:19
 */
@Service
@AllArgsConstructor
public class KdgExpCabinetCountServiceImpl implements KdgExpCabinetCountService {

    private KdgExpCabinetCountRepository kdgExpCabinetCountRepository;

    @Override
    public KdgExpCabinetCountRepository getRepository() {
        return kdgExpCabinetCountRepository;
    }
}

