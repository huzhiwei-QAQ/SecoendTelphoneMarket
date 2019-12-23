package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.ProductSaled;

@Repository
public interface ProductSaledMapper {
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
