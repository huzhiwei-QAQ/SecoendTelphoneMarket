package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Product;
import com.hqyj.entity.ProductSaled;
@Repository
public interface ProductMapper {
	//查询所用产品
 public List<Product> selectAll();
//减少库存
public int updateProductNum(Product product);
//产品入库
public int updateProduct(Product product);
}
