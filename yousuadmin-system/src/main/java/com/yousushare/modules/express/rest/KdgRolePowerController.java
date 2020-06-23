package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgRolePower;
import com.yousushare.modules.express.service.KdgRolePowerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:05
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgRolePower")
public class KdgRolePowerController extends BaseController<KdgRolePower,String> {
    private KdgRolePowerService kdgRolePowerService;
    @Override
    public KdgRolePowerService getService() {
        return kdgRolePowerService;
    }
}

