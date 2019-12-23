package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.AuthorityMapper;
import com.hqyj.entity.Authority;
import com.hqyj.entity.User;
import com.hqyj.service.AuthorityService;
@Service
public class AuthorityServicelmpl implements AuthorityService{
@Autowired
private AuthorityMapper authorityMapper;
	@Override
	public List<Authority> selecAuthorityAll(String username) {
List<Authority> selecAuthorityAll = authorityMapper.selecAuthorityAll(username);
		return selecAuthorityAll;
	}

}
