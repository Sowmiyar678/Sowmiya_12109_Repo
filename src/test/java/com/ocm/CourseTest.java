package com.ocm;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ocm.bean.Course;
import com.ocm.controller.CourseController;
@SpringBootTest
class CourseTest {
	
	List<Course> list=new ArrayList<Course>();
	List<Course> list1=new ArrayList<>();
	Course ocm;
	Course ocm2;
	  
	@Autowired 
	CourseController coursecontroller;
	
	String insert;
	String delete;
	String update;
	String result;
	String result1;
	
	@Test
	void performInsertTest() {
		Course course=new Course();
		course.setName("Full Stack");
		course.setType("online");
		insert="Course Details Saved";
		result=coursecontroller.addcourse(course);
	    Assert.assertEquals(insert,result);
	    }
	
	@Test
	void performFindCourseTest() {
		Course course=new Course();
		course=coursecontroller.getcourse(1);
		System.out.println(course);
		assertNotNull(course);
		}
	
	
	
	
	@Test
	void PerformGetAllCourseTest() {
		list=coursecontroller.getallcourse();
		assertNotNull(list1);
	}
	
	
	
	
	
   
	
	
	

}
