package com.blandon.ehcache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = null;
		try{
			appContext = new AnnotationConfigApplicationContext(AppConfig.class);
			
			UserDao userDao = (UserDao)appContext.getBean("UserDao");
			
			User user = userDao.findUserByName("hello");
			
			user = userDao.findUserByName("hello");
			
			user = userDao.findUserByName("hi");
			
			logger.debug("user name: "+user.getName());
		}finally{
		}

		
		
	}
}
