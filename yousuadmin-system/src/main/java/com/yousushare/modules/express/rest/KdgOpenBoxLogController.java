package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgOpenBoxLog;
import com.yousushare.modules.express.service.KdgOpenBoxLogService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:46
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgOpenBoxLog")
public class KdgOpenBoxLogController extends BaseController<KdgOpenBoxLog,String> {
    private KdgOpenBoxLogService kdgOpenBoxLogService;
    @Override
    public KdgOpenBoxLogService getService() {
        return kdgOpenBoxLogService;
    }
}

