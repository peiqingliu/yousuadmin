package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgBoxTypeRepository;
import com.yousushare.modules.express.service.KdgBoxTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:35
 */
@Service
@AllArgsConstructor
public class KdgBoxTypeServiceImpl implements KdgBoxTypeService {

    private KdgBoxTypeRepository kdgBoxTypeRepository;
    @Override
    public KdgBoxTypeRepository getRepository() {
        return kdgBoxTypeRepository;
    }
}

