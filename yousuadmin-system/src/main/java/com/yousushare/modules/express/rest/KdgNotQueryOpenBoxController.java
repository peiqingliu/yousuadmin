package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgNotQueryOpenBox;
import com.yousushare.modules.express.service.KdgNotQueryOpenBoxService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:40
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/KdgNotQueryOpenBox")
public class KdgNotQueryOpenBoxController extends BaseController<KdgNotQueryOpenBox,String> {
    private KdgNotQueryOpenBoxService kdgNotQueryOpenBoxService;
    @Override
    public KdgNotQueryOpenBoxService getService() {
        return kdgNotQueryOpenBoxService;
    }
}

