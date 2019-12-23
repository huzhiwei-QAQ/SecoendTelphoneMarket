package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Goods;

public interface GoodsService {
	//查询所有商品
public List<Goods> selectAllGoods();
//增加商品库存
public int updateGoods(Goods goods);
//商品出库
public int updateGoodsNum(Goods goods);
}
