package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgBoxType;
import com.yousushare.modules.express.service.KdgBoxTypeService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:33
 */
@Api(tags = "快递：柜子类型")
@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/express/kdgBoxType")
public class KdgBoxTypeController extends BaseController<KdgBoxType,String> {

    private KdgBoxTypeService kdgBoxTypeService;

    @Override
    public KdgBoxTypeService getService() {
        return kdgBoxTypeService;
    }
}

