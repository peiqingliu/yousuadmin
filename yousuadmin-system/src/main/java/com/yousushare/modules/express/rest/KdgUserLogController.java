package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgUserLog;
import com.yousushare.modules.express.service.KdgUserLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:38
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgUserLog")
public class KdgUserLogController extends BaseController<KdgUserLog,String> {
    private KdgUserLogService kdgUserLogService;
    @Override
    public KdgUserLogService getService() {
        return kdgUserLogService;
    }
}

