package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Purchase;
@Repository
public interface PurchaseMapper {
//添加采购订单
	public int insertPurchase(Purchase purchase);
	//查询采购订单
	public List<Purchase> selectPurchase();
}
