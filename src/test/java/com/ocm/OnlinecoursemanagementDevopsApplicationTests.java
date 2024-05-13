package com.ocm;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ocm.bean.Course;
import com.ocm.bean.Enrollment;
import com.ocm.bean.User;
import com.ocm.controller.CourseController;
import com.ocm.controller.EnrollmentController;
import com.ocm.controller.UserController;

@SpringBootTest
class OnlinecoursemanagementDevopsApplicationTests {
	
	

	List<Enrollment> list1=new ArrayList<Enrollment>();
	List<Enrollment> list2=new ArrayList<>();
	Enrollment enroll;
	Enrollment enroll2;
	
	@Autowired
	private UserController usercontroller;
	
	@Autowired
	private EnrollmentController enrollmentcontroller;
	
	@Autowired
	private CourseController coursecontroller;
	
	String insert;
	String delete;
	String result;
	
	@Test
	void performenInsertrolltest() {
		Enrollment enrollment=new Enrollment();
		Course course=new Course();
		course.setId(1);
		User user=new User();
		user.setId(1l);
		enrollment.setDate("01/01/23");
		enrollment.setCourse(course);
		enrollment.setUser(user);
		insert= "Enroll Object Saved";
		result=enrollmentcontroller.addenroll(enrollment);
		Assert.assertEquals(insert, result);
		
	}
		
	@Test
	void GetAllEnroll() {
		list1=enrollmentcontroller.getallenroll();
		assertNotNull(list1);
	}
}
