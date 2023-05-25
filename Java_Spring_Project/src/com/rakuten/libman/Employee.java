package com.rakuten.libman;

public class Employee {
	public String name;

	public String getName() {
		return name;

	}
	public void setName(String name) {
		this.name=name;

	}
	public void displayName() {
		System.out.println("Welcome to spring sessinon"+ this.name);

	}

}
