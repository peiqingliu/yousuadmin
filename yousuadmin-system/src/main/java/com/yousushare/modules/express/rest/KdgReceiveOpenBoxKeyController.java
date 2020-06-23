package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgReceiveOpenBoxKey;
import com.yousushare.modules.express.service.KdgReceiveOpenBoxKeyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-15 21:56
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgReceiveOpenBoxKey")
public class KdgReceiveOpenBoxKeyController extends BaseController<KdgReceiveOpenBoxKey,String> {
    private KdgReceiveOpenBoxKeyService kdgReceiveOpenBoxKeyService;
    @Override
    public KdgReceiveOpenBoxKeyService getService() {
        return kdgReceiveOpenBoxKeyService;
    }
}

