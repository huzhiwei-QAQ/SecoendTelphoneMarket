package com.hqyj.dao;

import org.springframework.stereotype.Repository;

import com.hqyj.entity.UserRole;

@Repository
public interface UserRoleMapper {
public int addUserRole(UserRole userRole);

public int deletUserRole(int id);

public int updateUserRole(UserRole userRole);
}
