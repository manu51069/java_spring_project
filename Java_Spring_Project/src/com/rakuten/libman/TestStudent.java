package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("employeeContext.xml");
		Employee emp= (Employee)context.getBean("empbean");
		emp.displayDetails();
	}

}
