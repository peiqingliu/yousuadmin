package com.yousushare.modules.express.service.impl;

import com.yousushare.modules.express.repository.KdgBoxUseListRepository;
import com.yousushare.modules.express.service.KdgBoxUseListService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:44
 */
@Slf4j
@Service
@AllArgsConstructor
public class KdgBoxUseListServiceImpl implements KdgBoxUseListService {

    private KdgBoxUseListRepository kdgBoxUseListRepository;

    @Override
    public KdgBoxUseListRepository getRepository() {
        return kdgBoxUseListRepository;
    }
}

