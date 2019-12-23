package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Supplier;

@Repository
public interface SupplierMapper {
	//查询所有供应商
public List<Supplier> selectAllSupplier();

}
