package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Order;

@Repository
public interface OrderMapper {
	//添加订单
public int insertOrder(Order order);
//根据姓名删除订单
public int deletOrder(String name);
//查询所有待销售订单
public List<Order> selectAllOrder();
//添加出库产品,把待销售订单表的信息放入出库产品表
public int addGoodsExported(String name);
}
