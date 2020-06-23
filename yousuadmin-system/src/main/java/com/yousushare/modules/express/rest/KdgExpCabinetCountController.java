package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgExpCabinetCount;
import com.yousushare.modules.express.service.KdgExpCabinetCountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 22:20
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgExpCabinetCount")
public class KdgExpCabinetCountController extends BaseController<KdgExpCabinetCount,String> {

    private KdgExpCabinetCountService kdgExpCabinetCountService;
    @Override
    public KdgExpCabinetCountService getService() {
        return kdgExpCabinetCountService;
    }
}

