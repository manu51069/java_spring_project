package com.rakuten.libman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextBookMap {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("BookMap.xml");
		BookMap stu= (BookMap)context.getBean("mapbookbean");
		stu.displayBook();
		}
}
