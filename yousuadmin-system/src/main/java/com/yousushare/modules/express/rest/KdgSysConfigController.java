package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgSysConfig;
import com.yousushare.modules.express.service.KdgSysConfigService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:21
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgSysConfig")
public class KdgSysConfigController extends BaseController<KdgSysConfig,String> {
    private KdgSysConfigService kdgSysConfigService;
    @Override
    public KdgSysConfigService getService() {
        return kdgSysConfigService;
    }
}

