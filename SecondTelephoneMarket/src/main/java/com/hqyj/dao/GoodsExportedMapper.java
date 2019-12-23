package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.GoodsExported;

@Repository
public interface GoodsExportedMapper {
//查询出库产品
	public List<GoodsExported> selectGoodsExported();
//删除出库商品
	public int deletGoodsExported(String type);
}
