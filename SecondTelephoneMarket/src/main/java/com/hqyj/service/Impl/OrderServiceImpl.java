package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.OrderMapper;
import com.hqyj.entity.Order;
import com.hqyj.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{
@Autowired
private OrderMapper orderMapper;
	@Override
	public int insertOrder(Order order) {
		 int insertOrder = orderMapper.insertOrder(order);
		 return insertOrder;
	}

	@Override
	public int deletOrder(String name) {
		int deletOrder = orderMapper.deletOrder(name);
		return deletOrder;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Order> selectAllOrder() {
		List<Order> selectAllOrder = orderMapper.selectAllOrder();
		return selectAllOrder;
	}

	@Override
	public int addGoodsExported(String name) {
		int addGoodsExported = orderMapper.addGoodsExported(name);
		return addGoodsExported;
	}



}
