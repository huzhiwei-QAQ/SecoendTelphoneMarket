package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Role;

public interface RoleService {
	//根据权限查询权限表
		public Role selectRole(String roles);
		//查询所有的角色
		public List<Role> selectAllRole();
}
