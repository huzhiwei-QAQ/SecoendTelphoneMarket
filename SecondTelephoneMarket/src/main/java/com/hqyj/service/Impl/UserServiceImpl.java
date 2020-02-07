package com.hqyj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hqyj.dao.UserMapper;
import com.hqyj.entity.Authority;
import com.hqyj.entity.User;
import com.hqyj.service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserMapper UserMapper;

@Override
public User selectUser(String username) {
	User selectUser = UserMapper.selectUser(username);
	return selectUser;
}

@Override
public List<User> selectUserAll() {
	List<User> selectUserAll = UserMapper.selectUserAll();
	return selectUserAll;
}

@Override
public int deleteUserbyName(String username) {
	int deleteUserbyName = UserMapper.deleteUserbyName(username);
	return deleteUserbyName;
}

@Override
public int updateVerificationCode(User user) {
	int updateVerificationCode = UserMapper.updateVerificationCode(user);
	return updateVerificationCode;
}

@Override
public int updatePassword(User user) {
	int updatePassword = UserMapper.updatePassword(user);
	return updatePassword;
}


}
