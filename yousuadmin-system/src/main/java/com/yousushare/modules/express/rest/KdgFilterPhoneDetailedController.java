package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgFilterPhoneDetailed;
import com.yousushare.modules.express.service.KdgFilterPhoneDetailedService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-13 21:52
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgFilterPhoneDetailed")
public class KdgFilterPhoneDetailedController extends BaseController<KdgFilterPhoneDetailed,String> {

    private KdgFilterPhoneDetailedService kdgFilterPhoneDetailedService;

    @Override
    public KdgFilterPhoneDetailedService getService() {
        return kdgFilterPhoneDetailedService;
    }
}

