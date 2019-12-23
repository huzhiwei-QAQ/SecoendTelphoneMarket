package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.GoodsStatisticsMapper;

import com.hqyj.entity.GoodsStatistics;
import com.hqyj.service.GoodsStatisticsService;
@Service
public class GoodsStatisticsServiceImlp implements GoodsStatisticsService{
@Autowired
private GoodsStatisticsMapper goodsStatisticsMapper;
	@Override
	public int updateGoodsStatistics(GoodsStatistics goodsStatistics) {
		int updateGoodsStatistics = goodsStatisticsMapper.updateGoodsStatistics(goodsStatistics);
		return updateGoodsStatistics;
	}

	@Override
	public List<GoodsStatistics> selectGoodsStatistics() {
		List<GoodsStatistics> selectGoodsStatistics = goodsStatisticsMapper.selectGoodsStatistics();
		return selectGoodsStatistics;
	}

	@Override
	public int updateGoodsStatisticsPrice(GoodsStatistics goodsStatistics) {
		int updateGoodsStatisticsPrice = goodsStatisticsMapper.updateGoodsStatisticsPrice(goodsStatistics);
		return updateGoodsStatisticsPrice;
	}

	@Override
	public GoodsStatistics selectGoodsStatisticsOne(String type) {
		GoodsStatistics selectGoodsStatisticsOne = goodsStatisticsMapper.selectGoodsStatisticsOne(type);
		return selectGoodsStatisticsOne;
	}

	@Override
	public GoodsStatistics selectCount1() {
		GoodsStatistics selectCount1 = goodsStatisticsMapper.selectCount1();
		return selectCount1;
	}



}
