package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgBaseDataSelect;
import com.yousushare.modules.express.service.KdgBaseDataSelectService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-10 22:43
 */
@Api(tags = "快递：所有客户端连接信息")
@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/express/kdgBaseDataSelect")
public class KdgBaseDataSelectController extends BaseController<KdgBaseDataSelect,String> {
    private KdgBaseDataSelectService kdgBaseDataSelectService;

    @Override
    public KdgBaseDataSelectService getService() {
        return kdgBaseDataSelectService;
    }
}

