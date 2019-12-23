package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.ProductSaledMapper;
import com.hqyj.entity.ProductSaled;
import com.hqyj.service.ProductSaledService;

@Service
public class ProductSaledServiceImpl implements ProductSaledService{
@Autowired
private ProductSaledMapper productSaledMapper;
	@Override
	public List<ProductSaled> selectAllProductSaled() {
		List<ProductSaled> selectAllProductSaled = productSaledMapper.selectAllProductSaled();
		return selectAllProductSaled;
	}

	@Override
	public int updateProductSaledNum(ProductSaled productSaled) {
		int updateProductSaledNum = productSaledMapper.updateProductSaledNum(productSaled);
		return updateProductSaledNum;
	}

	@Override
	public int updateProductSaledNumprice(ProductSaled productSaled) {
		int updateProductSaledNumprice = productSaledMapper.updateProductSaledNumprice(productSaled);
		return updateProductSaledNumprice;
	}

	@Override
	public ProductSaled selectProductSaledOne(String type) {
		ProductSaled selectProductSaledOne = productSaledMapper.selectProductSaledOne(type);
		return selectProductSaledOne;
	}

	@Override
	public ProductSaled selectCount2() {
		ProductSaled selectCount2 = productSaledMapper.selectCount2();
		return selectCount2;
	}

}
