package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgFilterPhone;
import com.yousushare.modules.express.service.KdgFilterPhoneService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-13 21:39
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgFilterPhone")
public class KdgFilterPhoneController extends BaseController<KdgFilterPhone,String> {

    private KdgFilterPhoneService kdgFilterPhoneService;

    @Override
    public KdgFilterPhoneService getService() {
        return kdgFilterPhoneService;
    }
}

