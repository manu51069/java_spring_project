package com.setter.injection;

public class Employee {
	int id;
	String name;
	String des;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public  void displayDetails() {
		System.out.println(this.id+"|"+ this.name+"|"+this.des);
	}
}
