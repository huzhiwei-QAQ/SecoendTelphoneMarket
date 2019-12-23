package com.hqyj.service;

import java.util.List;

import com.hqyj.entity.Authority;
import com.hqyj.entity.User;

public interface AuthorityService {
	public List<Authority> selecAuthorityAll(String username);
}
