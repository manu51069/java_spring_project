package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJersey {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("jerseyContext.xml");
		IndianJersey can= (IndianJersey)context.getBean("jerseybean");
		can.displayTeam();
	}

}
