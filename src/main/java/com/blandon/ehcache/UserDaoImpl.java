package com.blandon.ehcache;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public class UserDaoImpl  {

	@Cacheable(value="users", key="#name")
	public Map findUserByName(String name) {
		
		User user = new User(name);
		
		Map<String, User> map = new HashMap<String, User>();
		
		return map;
	}

}
