package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Authority;
import com.hqyj.entity.User;
@Repository
public interface AuthorityMapper {
	//查询用户权限
	public List<Authority> selecAuthorityAll(String username);
}
