package com.hqyj.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.UserRoleMapper;
import com.hqyj.entity.UserRole;
import com.hqyj.service.UserRoleService;
@Service
public class UserRoleServiceImpl implements UserRoleService{
	@Autowired
private UserRoleMapper userRoleMapper;
	
	@Override
	public int addUserRole(UserRole userRole) {
		int addUserRole = userRoleMapper.addUserRole(userRole);
		return addUserRole;
	}

	@Override
	public int deletUserRole(int id) {
		int deletUserRole = userRoleMapper.deletUserRole(id);
		return deletUserRole;
	}

	@Override
	public int updateUserRole(UserRole userRole) {
		int updateUserRole = userRoleMapper.updateUserRole(userRole);
		return updateUserRole;
	}

}
