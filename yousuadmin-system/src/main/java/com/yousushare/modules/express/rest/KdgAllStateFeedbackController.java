package com.yousushare.modules.express.rest;


import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgAllStateFeedback;
import com.yousushare.modules.express.service.KdgAllStateFeedbackService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "快递：所有客户端连接信息")
@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/express/kdgAllStateFeedback")
public class KdgAllStateFeedbackController extends BaseController<KdgAllStateFeedback,String> {

    private KdgAllStateFeedbackService kdgAllStateFeedbackService;

    @Override
    public KdgAllStateFeedbackService getService() {
        return kdgAllStateFeedbackService;
    }
}
