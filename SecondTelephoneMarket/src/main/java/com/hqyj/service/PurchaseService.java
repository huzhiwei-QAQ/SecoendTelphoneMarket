package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Purchase;

public interface PurchaseService {
	//添加采购订单
		public int insertPurchase(Purchase purchase);
		//查询采购订单
		public List<Purchase> selectPurchase();
}
