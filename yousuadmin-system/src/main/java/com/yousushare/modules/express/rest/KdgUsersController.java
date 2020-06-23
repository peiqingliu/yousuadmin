package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgUsers;
import com.yousushare.modules.express.service.KdgUsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 22:43
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgUsers")
public class KdgUsersController extends BaseController<KdgUsers,String> {
    private KdgUsersService kdgUsersService;
    @Override
    public KdgUsersService getService() {
        return kdgUsersService;
    }
}

