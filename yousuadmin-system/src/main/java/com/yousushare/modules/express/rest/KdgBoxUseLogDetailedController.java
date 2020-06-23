package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgBoxUseLogDetailed;
import com.yousushare.modules.express.service.KdgBoxUseLogDetailedService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 22:07
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgBoxUseLogDetailed")
public class KdgBoxUseLogDetailedController extends BaseController<KdgBoxUseLogDetailed,String> {

    private KdgBoxUseLogDetailedService kdgBoxUseLogDetailedService;
    @Override
    public KdgBoxUseLogDetailedService getService() {
        return kdgBoxUseLogDetailedService;
    }
}

