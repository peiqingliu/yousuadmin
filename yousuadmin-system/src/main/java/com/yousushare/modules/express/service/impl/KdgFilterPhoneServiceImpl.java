package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.base.BaseDao;
import com.yousushare.modules.express.domain.KdgFilterPhone;
import com.yousushare.modules.express.repository.KdgFilterPhoneRepository;
import com.yousushare.modules.express.service.KdgFilterPhoneService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * @Auther Liupeiqing
 * @Date 2020-06-13 21:38
 */
@AllArgsConstructor
@Service
public class KdgFilterPhoneServiceImpl implements KdgFilterPhoneService {

    private KdgFilterPhoneRepository kdgFilterPhoneRepository;

    @Override
    public KdgFilterPhoneRepository getRepository() {
        return kdgFilterPhoneRepository;
    }
}

