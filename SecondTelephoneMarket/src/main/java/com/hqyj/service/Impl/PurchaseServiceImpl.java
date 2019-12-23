package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.PurchaseMapper;
import com.hqyj.entity.Purchase;
import com.hqyj.entity.PurchaseOrders;
import com.hqyj.service.PurchaseOrdersService;
import com.hqyj.service.PurchaseService;
@Service
public class PurchaseServiceImpl implements PurchaseService{
@Autowired
private PurchaseMapper purchaseMapper;


	@Override
	public int insertPurchase(Purchase purchase) {
		int insertPurchase = purchaseMapper.insertPurchase(purchase);
		return insertPurchase;
	}

	@Override
	public List<Purchase> selectPurchase() {
		List<Purchase> selectPurchase = purchaseMapper.selectPurchase();
		return selectPurchase;
	}

}
