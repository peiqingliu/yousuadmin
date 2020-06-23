package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgBoxUseLogRemarks;
import com.yousushare.modules.express.service.KdgBoxUseLogRemarksService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 21:51
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/express/kdgBoxUseLogRemarks")
public class KdgBoxUseLogRemarksController extends BaseController<KdgBoxUseLogRemarks,String> {

    private KdgBoxUseLogRemarksService kdgBoxUseLogRemarksService;

    @Override
    public KdgBoxUseLogRemarksService getService() {
        return kdgBoxUseLogRemarksService;
    }
}

