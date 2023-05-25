package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCandidates {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("candidatesContext.xml");
		Candidates can= (Candidates)context.getBean("candidatesbean");
		can.displayDetails();
		
	}

}
