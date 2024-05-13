package com.ocm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ocm.bean.Course;
import com.ocm.bean.User;
import com.ocm.controller.UserController;

@SpringBootTest
class UserTest {
	
	@Autowired
	UserController usercontroller;
	
	String insert;
	String result;
	
	@Test
	void performInsertTest() {
		User user=new User();
		user.setName("vaanmathi");
		user.setCity("chennai");
		user.setEmail("vaan@gmail.com");
		user.setPhoneno("9897658909");
		insert="User Object Saved";
		result=usercontroller.adduser(user);
	    Assert.assertEquals(insert,result);
	    }

	

}
