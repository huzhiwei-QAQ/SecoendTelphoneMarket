package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.GoodsInMapper;
import com.hqyj.entity.GoodsIn;
import com.hqyj.service.GoodsInService;
@Service
public class GoodsInServiceImpl implements GoodsInService{
@Autowired
private GoodsInMapper goodsInMapper;
	@Override
	public List<GoodsIn> selectGoodsIn() {
		List<GoodsIn> selectGoodsIn = goodsInMapper.selectGoodsIn();
		return selectGoodsIn;
	}

	@Override
	public int deletGoodsIn(String type) {
		int deletGoodsIn = goodsInMapper.deletGoodsIn(type);
		return deletGoodsIn;
	}

}
