package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.ProductMapper;
import com.hqyj.entity.Product;
import com.hqyj.service.ProductService;
@Service
public class ProductServicelmpl implements ProductService{
@Autowired
private ProductMapper productMapper;
	@Override
	public List<Product> selectAll() {
		List<Product> selectAll = productMapper.selectAll();
		return selectAll;
	}
	@Override
	public int updateProductNum(Product product) {
		int updateProductNum = productMapper.updateProductNum(product);
		return updateProductNum;
	}
	@Override
	public int updateProduct(Product product) {
		int updateProduct = productMapper.updateProduct(product);
		return updateProduct;
	}

}
