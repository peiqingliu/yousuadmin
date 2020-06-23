package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgGroup;
import com.yousushare.modules.express.service.KdgGroupService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:15
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgGroup")
public class KdgGroupController extends BaseController<KdgGroup,String> {

    private KdgGroupService kdgGroupService;

    @Override
    public KdgGroupService getService() {
        return kdgGroupService;
    }
}

