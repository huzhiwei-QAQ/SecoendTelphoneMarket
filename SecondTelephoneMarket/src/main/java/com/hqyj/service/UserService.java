package com.hqyj.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hqyj.entity.Authority;
import com.hqyj.entity.User;

public interface UserService {


	
	public User selectUser(String username);
	//查询所有用户
	public List<User> selectUserAll();
	//删除员工
	public  int deleteUserbyName(String username);
}
