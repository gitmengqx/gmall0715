package com.atguigu.gmall0715.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall0715.bean.BaseAttrInfo;
import com.atguigu.gmall0715.bean.BaseCatalog1;
import com.atguigu.gmall0715.bean.BaseCatalog2;
import com.atguigu.gmall0715.bean.BaseCatalog3;
import com.atguigu.gmall0715.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController
@CrossOrigin
public class ManageController {

    @Reference
    private ManageService manageService;
    // 返回所有的一级分类数据： getCatalog1
    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){
        return manageService.getCatalog1();
    }

    // 参数如何得到？
    // @PathVariable 做restful 请求时用的！ @RequestParam = 获取参数 对象传值：传递过来的参数与实体类的属性名称一致！
    // http://localhost:8082/getCatalog2?catalog1Id=2
    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id,BaseCatalog2 baseCatalog2){
        // select * from basecatalog2 where catalog1Id = ?
        // return manageService.getCatalog2(catalog1Id);
        return manageService.getCatalog2(baseCatalog2);
    }

    // 参数如何得到？
    // @PathVariable 做restful 请求时用的！ @RequestParam = 获取参数 对象传值：传递过来的参数与实体类的属性名称一致！
    // http://localhost:8082/getCatalog3?catalog2Id=13
    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id,BaseCatalog3 baseCatalog3){

        return manageService.getCatalog3(baseCatalog3);
    }
//    http://localhost:8082/attrInfoList?catalog3Id=61
    @RequestMapping("attrInfoList")
    public List<BaseAttrInfo> attrInfoList(String catalog3Id,BaseAttrInfo baseAttrInfo){
        return manageService.getAttrInfoList(baseAttrInfo);
    }

    // http://localhost:8082/saveAttrInfo
    // 必须接收前台的数据
    @RequestMapping("saveAttrInfo")
    public void saveAttrInfo(BaseAttrInfo baseAttrInfo){
        // 调用服务层：
        manageService.saveAttrInfo(baseAttrInfo);

    }

}
