package com.rakuten.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stubApplicationContext context= new ClassPathXmlApplicationContext("employeeContext.xml");
		ApplicationContext context= new ClassPathXmlApplicationContext("EmployeeContext.xml");
		Employee stu= (Employee)context.getBean("employeebean");
		stu.displayname();
	}
}
