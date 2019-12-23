package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.ProductSaled;

public interface ProductSaledService {
	//查询销售出去几部手机
public List<ProductSaled> selectAllProductSaled();
//增加销售的部数
public int updateProductSaledNum(ProductSaled productSaled);
//增加该机型的总销售额
public int updateProductSaledNumprice(ProductSaled productSaled);
//查看某一机型的销售结款
public ProductSaled selectProductSaledOne(String type);
//查看总销售结款
public ProductSaled selectCount2();
}
