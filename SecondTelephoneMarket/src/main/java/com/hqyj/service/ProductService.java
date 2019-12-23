package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Product;

public interface ProductService {
	 public List<Product> selectAll();
	 
	//减少库存
	 public int updateProductNum(Product product);
	 
	//产品入库
	 public int updateProduct(Product product);
}
