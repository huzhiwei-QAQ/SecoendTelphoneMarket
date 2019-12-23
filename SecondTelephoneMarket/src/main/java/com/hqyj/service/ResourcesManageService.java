package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.ResourcesManage;


public interface ResourcesManageService {
	//增加新的手机型号
    public int addNewResources(ResourcesManage resourcesManage);
    //查询所有内容
    public List<ResourcesManage> selectAllNewResources();
    //往采购商品表增加新机型
    public int insertGoods(String type);
    //往商品采购结算表中增加新机型
    public int insertGoodsStatistics(String type);
    //往产品表中增加新机型
    public int insertProduct(String type);
    //往产品结算表中增加新机型
    public int insertproductSaled(String type);
}
