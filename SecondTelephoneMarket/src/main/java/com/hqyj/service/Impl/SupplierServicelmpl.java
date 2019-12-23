package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.SupplierMapper;
import com.hqyj.entity.Supplier;
import com.hqyj.service.SupplierService;
@Service
public class SupplierServicelmpl implements SupplierService{
@Autowired
private SupplierMapper supplierMapper;
	@Override
	public List<Supplier> selectAllSupplier() {
		List<Supplier> selectAllSupplier = supplierMapper.selectAllSupplier();
		return selectAllSupplier;
	}

}
