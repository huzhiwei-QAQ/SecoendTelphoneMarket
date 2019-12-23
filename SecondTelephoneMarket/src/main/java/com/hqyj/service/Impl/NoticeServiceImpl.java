package com.hqyj.service.Impl;

import java.util.List;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.NoticeMapper;
import com.hqyj.entity.Notice;
import com.hqyj.service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{
@Autowired
private NoticeMapper noticeMapper;
	@Override
	public List<Notice> selectAllNotice() {
		List<Notice> selectAllNotice = noticeMapper.selectAllNotice();
		return selectAllNotice;
	}

}
