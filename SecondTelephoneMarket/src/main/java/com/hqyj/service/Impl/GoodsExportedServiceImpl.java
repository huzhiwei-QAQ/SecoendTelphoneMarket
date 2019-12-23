package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.GoodsExportedMapper;
import com.hqyj.entity.GoodsExported;
import com.hqyj.service.GoodsExportedService;

@Service
public class GoodsExportedServiceImpl implements GoodsExportedService{
@Autowired
private GoodsExportedMapper goodsExportedMapper;
	@Override
	public List<GoodsExported> selectGoodsExported() {
		List<GoodsExported> selectGoodsExported = goodsExportedMapper.selectGoodsExported();
		return selectGoodsExported;
	}



	@Override
	public int deletGoodsExported(String type) {
		int deletGoodsExported = goodsExportedMapper.deletGoodsExported(type);
		return deletGoodsExported;

	}

}
