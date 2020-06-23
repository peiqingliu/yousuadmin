package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgExpCabinetKey;
import com.yousushare.modules.express.service.KdgExpCabinetKeyService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 22:26
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgExpCabinetKey")
public class KdgExpCabinetKeyController extends BaseController<KdgExpCabinetKey,String> {

    private KdgExpCabinetKeyService kdgExpCabinetKeyService;

    @Override
    public KdgExpCabinetKeyService getService() {
        return kdgExpCabinetKeyService;
    }
}

