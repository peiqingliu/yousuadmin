package com.yousushare.modules.express.rest;

import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgBoxUseList;
import com.yousushare.modules.express.service.KdgBoxUseListService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-11 21:43
 */
@Api(tags = "快递：柜子使用情况")
@RestController
@RequiredArgsConstructor
@AllArgsConstructor
@RequestMapping("/api/express/kdgBoxUseList")
public class KdgBoxUseListController extends BaseController<KdgBoxUseList,String> {

    private KdgBoxUseListService kdgBoxUseListService;

    @Override
    public KdgBoxUseListService getService() {
        return kdgBoxUseListService;
    }
}

