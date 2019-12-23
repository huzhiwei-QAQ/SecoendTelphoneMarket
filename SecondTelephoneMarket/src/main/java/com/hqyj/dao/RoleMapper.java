package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.Role;

@Repository
public interface RoleMapper {
//根据权限查询权限表
	public Role selectRole(String roles);
	
	//查询所有的角色
	public List<Role> selectAllRole();
}
