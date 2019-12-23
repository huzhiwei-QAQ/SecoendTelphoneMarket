package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Order;

public interface OrderService {
	//添加订单
public int insertOrder(Order order);
//根据姓名删除订单
public int deletOrder(String name);
//查询所有待销售订单
public List<Order> selectAllOrder();
//添加入库商品
public int addGoodsExported(String name);
}
