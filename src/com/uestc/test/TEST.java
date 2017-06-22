package com.uestc.test;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uestc.model.User;
import com.uestc.service.UserService;

public class TEST {
	private ApplicationContext ac =null;
	@Before
	public void beforeclass(){
		String[] locations = {"classpath:/com/uestc/config/*.xml", "classpath:/com/uestc/config/*.xml"}; 
		ac = new ClassPathXmlApplicationContext(locations);
	}
	@Test
	public void test() throws Exception{
	//	User user  = new User("2","LXQ",24);
	//	User user  = new User("www",24);
		UserService userServiceImpl = (UserService)ac.getBean("userServiceImpl");
		//userServiceImpl.test();
		//userServiceImpl.saveUser(user);
		User user = userServiceImpl.findUserByName("YMH");
		System.out.println("id: "+user.getUid()+" name: "+user.getName()+" age:" +user.getAge());
	}
}
