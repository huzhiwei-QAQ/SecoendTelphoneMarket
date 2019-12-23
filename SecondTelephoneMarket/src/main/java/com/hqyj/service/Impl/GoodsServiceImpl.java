package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.GoodsMapper;
import com.hqyj.entity.Goods;
import com.hqyj.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService{
@Autowired
private GoodsMapper goodsMapper;
	@Override
	public List<Goods> selectAllGoods() {
		List<Goods> selectAllGoods = goodsMapper.selectAllGoods();
		return selectAllGoods;
	}
	@Override
	public int updateGoods(Goods goods) {
		int updateGoods = goodsMapper.updateGoods(goods);
		return updateGoods;
	}
	@Override
	public int updateGoodsNum(Goods goods) {
		int updateGoodsNum = goodsMapper.updateGoodsNum(goods);
		return updateGoodsNum;
	}

}
