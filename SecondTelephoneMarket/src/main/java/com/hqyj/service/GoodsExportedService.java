package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.GoodsExported;

public interface GoodsExportedService {
	//查询出库产品
		public List<GoodsExported> selectGoodsExported();
	//删除出库商品
		public int deletGoodsExported(String type);
}
