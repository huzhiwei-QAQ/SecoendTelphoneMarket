package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.RoleMapper;
import com.hqyj.entity.Role;
import com.hqyj.service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
@Autowired
private RoleMapper roleMapper;
	@Override
	public Role selectRole(String roles) {
		Role selectRole = roleMapper.selectRole(roles);
		return selectRole;
	}
	@Override
	public List<Role> selectAllRole() {
		List<Role> selectAllRole = roleMapper.selectAllRole();
		return selectAllRole;
	}

}
