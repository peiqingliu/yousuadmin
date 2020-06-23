package com.yousushare.modules.express.rest;

import com.yousushare.annotation.Log;
import com.yousushare.modules.express.base.BaseController;
import com.yousushare.modules.express.domain.KdgExpCabinet;
import com.yousushare.modules.express.service.KdgExpCabinetService;
import com.yousushare.modules.express.service.dto.CabinetQueryCriteria;
import com.yousushare.modules.system.service.dto.JobQueryCriteria;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther Liupeiqing
 * @Date 2020-06-12 22:04
 */
@RestController
@AllArgsConstructor
@RequestMapping("/api/kdgExpCabinet")
public class KdgExpCabinetController extends BaseController<KdgExpCabinet,String> {

    private KdgExpCabinetService kdgExpCabinetService;


    @Log("查询快递柜")
    @ApiOperation("查询快递柜")
    @GetMapping
    @PreAuthorize("@el.check('cabinet:list')")
    public ResponseEntity<Object> query(CabinetQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(kdgExpCabinetService.queryAll(criteria, pageable), HttpStatus.OK);
    }

    @Override
    public KdgExpCabinetService getService() {
        return kdgExpCabinetService;
    }
}

