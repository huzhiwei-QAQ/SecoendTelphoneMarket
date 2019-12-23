package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Customer;

@Repository
public interface CustomerMapper {
//查询所用客户
	public List<Customer> selectAllCustomer();
	//添加用户
	public int addCustomer(Customer customer);
}
