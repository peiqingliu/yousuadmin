package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.base.BaseService;
import com.yousushare.modules.express.domain.KdgKeyValue;
import com.yousushare.modules.express.service.KdgKeyValueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:35
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgKeyValue")
public class KdgKeyValueController extends BaseController<KdgKeyValue,String> {
    private KdgKeyValueService kdgKeyValueService;
    @Override
    public KdgKeyValueService getService() {
        return kdgKeyValueService;
    }
}

