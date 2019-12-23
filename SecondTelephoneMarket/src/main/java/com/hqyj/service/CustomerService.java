package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Customer;

public interface CustomerService {
	//查询所用客户
		public List<Customer> selectAllCustomer();
		//添加用户
		public int addCustomer(Customer customer);
}
