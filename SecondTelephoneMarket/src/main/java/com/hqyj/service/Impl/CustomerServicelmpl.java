package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.CustomerMapper;
import com.hqyj.entity.Customer;
import com.hqyj.service.CustomerService;
@Service
public class CustomerServicelmpl implements CustomerService{
@Autowired
private CustomerMapper customerMapper;
	@Override
	public List<Customer> selectAllCustomer() {
		List<Customer> selectAllCustomer = customerMapper.selectAllCustomer();
		return selectAllCustomer;
	}
	@Override
	public int addCustomer(Customer customer) {
		int addCustomer = customerMapper.addCustomer(customer);
		return addCustomer;
	}

}
