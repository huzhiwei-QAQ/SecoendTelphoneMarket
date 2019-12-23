package com.hqyj.realm;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.hqyj.entity.Authority;
import com.hqyj.entity.User;
import com.hqyj.service.AuthorityService;
import com.hqyj.service.UserService;

public class MyRealm extends AuthorizingRealm {
@Autowired
private UserService userService;
@Autowired
private AuthorityService authorityService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
	
		//1.建一个集合，用于保存角色
		Set<String> roles = new HashSet<String>();
		//2.拿到session里面的用户名，进而查询出该用户具有的权限
		String username = (String)SecurityUtils.getSubject().getSession().getAttribute("USERNAME");
		List<Authority> selecAuthorityAll = authorityService.selecAuthorityAll(username);
		System.out.println(selecAuthorityAll);
for (Authority authority : selecAuthorityAll) {
	roles.add(authority.getAuthoritys());
}
System.out.println(roles);
		return new SimpleAuthorizationInfo(roles);
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		//1.获取UsernamePasswordToken
		UsernamePasswordToken upTaken = (UsernamePasswordToken)token;
		//2.验证数据库里面是否有相对应的用户
		//获取账号
		String username = upTaken.getUsername();
	System.out.println("username:"+username);
	User selectUser = userService.selectUser(username);
	System.out.println("selectUser:"+selectUser);
		//System.out.println(user);
		if(selectUser!=null){
			//进行认证
			//3.配置认证方法里面的参数
			//(1)配置身份参数
			Object principal = upTaken.getPrincipal();
			System.out.println("principal:"+principal);
			//（2） 拿到数据库已经加盐加密的密码
			Object hashedCredentials = selectUser.getPassword();
			System.out.println(hashedCredentials);
			//(3)获取加盐方式
		ByteSource credentialsSalt = ByteSource.Util.bytes(username);
		System.out.println(credentialsSalt);
			//(4)配置realm的名字
			String realmName = this.getName();

			System.out.println("拿到数据库信息和输入后被加密的信息比较");
	return  new SimpleAuthenticationInfo(principal, hashedCredentials, credentialsSalt, realmName);
		}else {
			throw new AuthenticationException();
		}
	
}
	}


