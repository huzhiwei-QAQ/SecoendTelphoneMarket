package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.GoodsIn;
@Repository
public interface GoodsInMapper {
//查询入库订单
	public List<GoodsIn> selectGoodsIn();
	//删除入库订单
	public int deletGoodsIn(String type);
}
