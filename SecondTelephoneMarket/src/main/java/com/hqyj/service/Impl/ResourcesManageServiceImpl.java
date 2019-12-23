package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.ResourcesManageMapper;
import com.hqyj.entity.ResourcesManage;
import com.hqyj.service.ResourcesManageService;


@Service
public class ResourcesManageServiceImpl implements ResourcesManageService{
@Autowired
private  ResourcesManageMapper resourcesManageMapper;

	@Override
	public int addNewResources(ResourcesManage resourcesManage) {
		int addNewResources = resourcesManageMapper.addNewResources(resourcesManage);
		return addNewResources;
	}

	@Override
	public List<ResourcesManage> selectAllNewResources() {
		List<ResourcesManage> selectAllNewResources = resourcesManageMapper.selectAllNewResources();
		return selectAllNewResources;
	}

	@Override
	public int insertGoods(String type) {
		int insertGoods = resourcesManageMapper.insertGoods(type);
		return insertGoods;
	}

	@Override
	public int insertGoodsStatistics(String type) {
		int insertGoodsStatistics = resourcesManageMapper.insertGoodsStatistics(type);
		return insertGoodsStatistics;
	}

	@Override
	public int insertProduct(String type) {
		int insertProduct = resourcesManageMapper.insertProduct(type);
		return insertProduct;
	}

	@Override
	public int insertproductSaled(String type) {
		int insertproductSaled = resourcesManageMapper.insertproductSaled(type);
		return insertproductSaled;
	}

}
