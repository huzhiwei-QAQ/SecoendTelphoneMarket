package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.NewUser;

public interface NewUserService {
	//添加新的员工
	public int addNewUser(NewUser newUser);
	//查看所有待添加的员工
	public List<NewUser> selectNewUser();
	//添加用户
	public int addUser(String name);
	//删除待添加员工
	public int deletNewUser(String name);
	//查询单条待添加员工
	public NewUser selectNewUserOne(String name);
}
