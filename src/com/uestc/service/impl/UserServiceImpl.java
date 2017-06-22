package com.uestc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.uestc.model.User;
import com.uestc.service.UserService;
@Component("userServiceImpl")
public class UserServiceImpl implements UserService{
	private static String USER_COLLECTION = "user";  
	
	@Autowired  
	private MongoTemplate mongoTemplate;
	
	public void saveUser(User user) {
		 mongoTemplate.save(user, USER_COLLECTION);            
	}
	public User findUserByName(String name) {
		 return mongoTemplate.findOne(new Query(Criteria.where("name").is(name)), User.class, USER_COLLECTION);  
	}
	public void test() {
		System.out.println("test");
	}  
}
