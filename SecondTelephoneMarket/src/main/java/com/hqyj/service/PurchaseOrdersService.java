package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.PurchaseOrders;

public interface PurchaseOrdersService {
	//添加待采购订单
		public int addPurchaseOrders(PurchaseOrders purchaseOrders);
		//查询待采购订单
		public List<PurchaseOrders> selectPurchaseOrders();
		//添加采购入库订单
		public int addWarehousing(String supplier);
		//删除待采购订单
		public int deleteaddPurchaseOrders(String supplier);
}
