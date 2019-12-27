package com.atguigu.gmall0715.service;

import com.atguigu.gmall0715.bean.BaseAttrInfo;
import com.atguigu.gmall0715.bean.BaseCatalog1;
import com.atguigu.gmall0715.bean.BaseCatalog2;
import com.atguigu.gmall0715.bean.BaseCatalog3;

import java.util.List;

public interface ManageService {
    /**
     * 表示查询一级分类数据
     * @return
     */
    List<BaseCatalog1> getCatalog1();

    /**
     * 通过一级分类Id 查询二级分类数据
     * @param catalog1Id
     * @return
     */
    List<BaseCatalog2> getCatalog2(String catalog1Id);

    /**
     * 通过二级分类对象来查询数据
     * @param baseCatalog2
     * @return
     */
    List<BaseCatalog2> getCatalog2(BaseCatalog2 baseCatalog2);

    /**
     *  通过三级分类属性来查询
     * @param baseCatalog3
     * @return
     */
    List<BaseCatalog3> getCatalog3(BaseCatalog3 baseCatalog3);

    /**
     * 通过三级分类Id 查询
     * @param baseAttrInfo
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);

    /**
     * 保存平台属性，平台属性值
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);
}
