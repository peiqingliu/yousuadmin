package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgBoxs;
import com.yousushare.modules.express.service.KdgBoxsService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:31
 */
@Api(tags = "快递：所有客户端连接信息")
@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/express/kdgBoxs")
public class KdgBoxsController extends BaseController<KdgBoxs,String> {

    private KdgBoxsService kdgBoxsService;

    @Override
    public KdgBoxsService getService() {
        return kdgBoxsService;
    }
}

