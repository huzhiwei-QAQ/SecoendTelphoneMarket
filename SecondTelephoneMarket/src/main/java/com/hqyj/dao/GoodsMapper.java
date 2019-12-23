package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Goods;
@Repository
public interface GoodsMapper {
	//查询所有商品
public List<Goods> selectAllGoods();
//增加商品库存
public int updateGoods(Goods goods);
//商品出库
public int updateGoodsNum(Goods goods);

}
