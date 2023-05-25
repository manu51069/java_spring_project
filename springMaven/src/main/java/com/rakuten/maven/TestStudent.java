package com.rakuten.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudent {
	
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("studentContext.xml");
	Student stu = (Student) context.getBean("stubean");
	stu.displayStudent();
	}

}

