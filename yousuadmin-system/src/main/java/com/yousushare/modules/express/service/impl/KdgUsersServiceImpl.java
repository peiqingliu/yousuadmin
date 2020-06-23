package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgUsersRepository;
import com.yousushare.modules.express.service.KdgUsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:44
 */
@AllArgsConstructor
@Service
public class KdgUsersServiceImpl implements KdgUsersService {
    private KdgUsersRepository kdgUsersRepository;
    @Override
    public KdgUsersRepository getRepository() {
        return kdgUsersRepository;
    }
}

