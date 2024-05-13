package com.ocm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ocm.bean.Enrollment;
import com.ocm.bean.User;
import com.ocm.dao.UserDAO;
import com.ocm.dao.UserDAOImpl;

import jakarta.persistence.Entity;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
	
	@Autowired
	UserDAOImpl dao;
	
	@PostMapping("/CreateUser")
	public String adduser(@RequestBody User user) {
		String msg="";
		try {
			dao.adduser(user);
			msg="User Object Saved";
		}catch(Exception e) {	
			msg="User Object Not Saved";
		}
		return msg;
	}

	
	 @GetMapping("/GetAllUser")
		public List<User> getalluser() {
			return  dao.getalluser();
			}

}
