package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.NewUserMapper;
import com.hqyj.entity.NewUser;
import com.hqyj.service.NewUserService;
@Service
public class NewUserServiceImpl implements NewUserService{
@Autowired 
private NewUserMapper newUserMapper;
	@Override
	public int addNewUser(NewUser newUser) {
		int addNewUser = newUserMapper.addNewUser(newUser);
		return addNewUser;
	}
	@Override
	public List<NewUser> selectNewUser() {
		List<NewUser> selectNewUser = newUserMapper.selectNewUser();
		return selectNewUser;
	}
	@Override
	public int addUser(String name) {
		int addUser = newUserMapper.addUser(name);
		return addUser;
	}
	@Override
	public int deletNewUser(String name) {
		int deletNewUser = newUserMapper.deletNewUser(name);
		return deletNewUser;
	}
	@Override
	public NewUser selectNewUserOne(String name) {
		NewUser selectNewUserOne = newUserMapper.selectNewUserOne(name);
		return selectNewUserOne;
	}


}
