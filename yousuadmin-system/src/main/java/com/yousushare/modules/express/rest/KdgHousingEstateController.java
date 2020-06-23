package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgHousingEstate;
import com.yousushare.modules.express.service.KdgHousingEstateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:23
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgHousingEstate")
public class KdgHousingEstateController extends BaseController<KdgHousingEstate,String> {
    private KdgHousingEstateService  kdgHousingEstateService;
    @Override
    public KdgHousingEstateService getService() {
        return kdgHousingEstateService;
    }
}

