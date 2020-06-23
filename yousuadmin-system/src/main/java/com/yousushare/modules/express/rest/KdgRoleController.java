package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgRole;
import com.yousushare.modules.express.service.KdgRoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:00
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/KdgRole")
public class KdgRoleController extends BaseController<KdgRole,String> {
    private KdgRoleService kdgRoleService;
    @Override
    public KdgRoleService getService() {
        return kdgRoleService;
    }
}

