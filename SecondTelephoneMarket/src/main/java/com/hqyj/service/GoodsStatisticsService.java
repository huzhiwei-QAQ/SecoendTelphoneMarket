package com.hqyj.service;

import java.util.List;


import com.hqyj.entity.GoodsStatistics;

public interface GoodsStatisticsService {
	//增加采购统计量
	public int updateGoodsStatistics(GoodsStatistics goodsStatistics);
	//查询采购统计量
	public List<GoodsStatistics> selectGoodsStatistics();
	//修改采购该机型所花的钱
	  public int updateGoodsStatisticsPrice(GoodsStatistics goodsStatistics);
	  //查询单挑采购统计
	  public GoodsStatistics selectGoodsStatisticsOne(String type);
	  //查询总采购结款
	  public GoodsStatistics selectCount1();
}
