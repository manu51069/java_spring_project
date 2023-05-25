package com.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBookMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("bookmapContext.xml");
		BookMap map= (BookMap)context.getBean("mapbookbean");
		map.displayBook();


	}

}
