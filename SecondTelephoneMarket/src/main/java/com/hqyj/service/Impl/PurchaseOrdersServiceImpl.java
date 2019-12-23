package com.hqyj.service.Impl;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.PurchaseOrdersMapper;
import com.hqyj.entity.PurchaseOrders;
import com.hqyj.service.PurchaseOrdersService;
@Service
public class PurchaseOrdersServiceImpl implements PurchaseOrdersService{
@Autowired
private PurchaseOrdersMapper purchaseOrdersMapper;
	@Override
	public int addPurchaseOrders(PurchaseOrders purchaseOrders) {
		int addPurchaseOrders = purchaseOrdersMapper.addPurchaseOrders(purchaseOrders);
		return addPurchaseOrders;
	}

	@Override
	public List<PurchaseOrders> selectPurchaseOrders() {
		List<PurchaseOrders> selectPurchaseOrders = purchaseOrdersMapper.selectPurchaseOrders();
		return selectPurchaseOrders;
	}

	@Override
	public int addWarehousing(String supplier) {
		int addWarehousing = purchaseOrdersMapper.addWarehousing(supplier);
		return addWarehousing;
	}

	@Override
	public int deleteaddPurchaseOrders(String supplier) {
		int deleteaddPurchaseOrders = purchaseOrdersMapper.deleteaddPurchaseOrders(supplier);
		return deleteaddPurchaseOrders;
	}

}
