package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgSysModel;
import com.yousushare.modules.express.service.KdgSysModelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:28
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgSysModel")
public class KdgSysModelController extends BaseController<KdgSysModel,String> {

    private KdgSysModelService kdgSysModelService;
    @Override
    public KdgSysModelService getService() {
        return kdgSysModelService;
    }
}

