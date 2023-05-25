package com.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("AutoWire.xml");
		Alpha a=context.getBean("alpha",Alpha.class);
		a.displayDetails();
	}
}
