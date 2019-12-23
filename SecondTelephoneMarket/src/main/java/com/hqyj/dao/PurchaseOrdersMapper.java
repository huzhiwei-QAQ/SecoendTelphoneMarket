package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.PurchaseOrders;

@Repository
public interface PurchaseOrdersMapper {
//添加待采购订单
	public int addPurchaseOrders(PurchaseOrders purchaseOrders);
	//查询待采购订单
	public List<PurchaseOrders> selectPurchaseOrders();
	//添加采购入库订单
	public int addWarehousing(String supplier);
	//删除待采购订单
	public int deleteaddPurchaseOrders(String supplier);
}
