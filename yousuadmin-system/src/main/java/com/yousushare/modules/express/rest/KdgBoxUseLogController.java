package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgBoxUseLog;
import com.yousushare.modules.express.service.KdgBoxUseLogService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:53
 */
@Api(tags = "快递：柜子使用日志")
@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/express/kdgBoxUseLog")
public class KdgBoxUseLogController extends BaseController<KdgBoxUseLog,String> {

    private KdgBoxUseLogService kdgBoxUseLogService;

    @Override
    public KdgBoxUseLogService getService() {
        return kdgBoxUseLogService;
    }
}

