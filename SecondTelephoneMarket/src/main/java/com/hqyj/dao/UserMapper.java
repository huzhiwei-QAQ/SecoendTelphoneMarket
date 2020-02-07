package com.hqyj.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.alibaba.druid.sql.dialect.oracle.ast.stmt.OracleConstraint.Initially;
import com.hqyj.entity.Authority;
import com.hqyj.entity.User;

@Repository
public interface UserMapper {
//根据用户查询用户信息
public User selectUser(String username);

//查询所有用户
public List<User> selectUserAll();

//删除员工
public  int deleteUserbyName(String username);

//修改验证码
public int updateVerificationCode(User user);

//修改密码
public int updatePassword(User user);
}
