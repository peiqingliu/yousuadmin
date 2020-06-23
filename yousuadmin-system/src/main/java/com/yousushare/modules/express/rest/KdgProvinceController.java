package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgProvince;
import com.yousushare.modules.express.service.KdgProvinceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:50
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgProvince")
public class KdgProvinceController extends BaseController<KdgProvince,String> {
    private KdgProvinceService kdgProvinceService;
    @Override
    public KdgProvinceService getService() {
        return kdgProvinceService;
    }
}

