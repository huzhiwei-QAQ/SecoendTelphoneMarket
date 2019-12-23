package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Notice;
@Repository
public interface NoticeMapper {
//查询所有信息
	public List<Notice> selectAllNotice();
}
