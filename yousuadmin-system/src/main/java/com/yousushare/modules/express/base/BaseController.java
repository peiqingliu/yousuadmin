package com.yousushare.modules.express.base;

import com.yousushare.utils.PageUtil;
import com.yousushare.utils.ResultUtil;
import com.yousushare.vo.PageVo;
import com.yousushare.vo.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @auther liupeiqing
 * @date 2019/9/5 18:38
 * @description 公共接口
 */
public abstract class BaseController<E,ID extends Serializable> {

    /**
     * 获取service
     * @return
     */
    @Autowired
    public abstract BaseService<E,ID> getService();



    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "通过id获取")
    public Result<E> get(@PathVariable ID id){

        E entity = getService().get(id);
        return new ResultUtil<E>().setData(entity);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取全部数据")
    public Result<List<E>> getAll(){

        List<E> list = getService().getAll();
        return new ResultUtil<List<E>>().setData(list);
    }

    @RequestMapping(value = "/getByPage", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "分页获取")
    public Result<Page<E>> getByPage(@ModelAttribute PageVo page){

        Page<E> data = getService().findAll(PageUtil.initPage(page));
        return new ResultUtil<Page<E>>().setData(data);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "保存数据")
    public Result<E> save(@RequestBody E entity){
        E e = getService().save(entity);
        return new ResultUtil<E>().setData(e);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(value = "更新数据")
    public Result<E> update(@RequestBody E entity){
        E e = getService().update(entity);
        return new ResultUtil<E>().setData(e);
    }


    @RequestMapping(value = "/delByIds/{ids}", method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value = "批量通过id删除")
    public Result<Object> delAllByIds(@PathVariable ID[] ids){

        for(ID id:ids){
            getService().delete(id);
        }
        return new ResultUtil<Object>().setSuccessMsg("批量通过id删除数据成功");
    }
}
