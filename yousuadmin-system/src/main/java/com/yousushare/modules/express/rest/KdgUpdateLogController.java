package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgUpdateLog;
import com.yousushare.modules.express.service.KdgUpdateLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:35
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgUpdateLog")
public class KdgUpdateLogController extends BaseController<KdgUpdateLog,String> {
    private KdgUpdateLogService kdgUpdateLogService;
    @Override
    public KdgUpdateLogService getService() {
        return kdgUpdateLogService;
    }
}

