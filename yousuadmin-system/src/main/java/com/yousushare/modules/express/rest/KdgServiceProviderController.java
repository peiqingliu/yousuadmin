package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgServiceProvider;
import com.yousushare.modules.express.service.KdgServiceProviderService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:14
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgServiceProvider")
public class KdgServiceProviderController extends BaseController<KdgServiceProvider,String> {
    private KdgServiceProviderService kdgServiceProviderService;
    @Override
    public KdgServiceProviderService getService() {
        return kdgServiceProviderService;
    }
}

