package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("libraryContext.xml");
		Books can= (Books)context.getBean("librarybean");
		can.display();;

	}

}
