package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.GoodsIn;

public interface GoodsInService {
	//查询入库订单
		public List<GoodsIn> selectGoodsIn();
		//删除入库订单
		public int deletGoodsIn(String type);
}
