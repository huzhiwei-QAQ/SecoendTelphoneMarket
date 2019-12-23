package com.hqyj.service;

import com.hqyj.entity.UserRole;

public interface UserRoleService {
	public int addUserRole(UserRole userRole);
	public int deletUserRole(int id);
	
	public int updateUserRole(UserRole userRole);
}
