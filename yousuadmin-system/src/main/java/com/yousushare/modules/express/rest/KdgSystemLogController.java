package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgSystemLog;
import com.yousushare.modules.express.service.KdgSystemLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:31
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgSystemLog")
public class KdgSystemLogController extends BaseController<KdgSystemLog,String> {
    private KdgSystemLogService kdgSystemLogService;
    @Override
    public KdgSystemLogService getService() {
        return kdgSystemLogService;
    }
}

