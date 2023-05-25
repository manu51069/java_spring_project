package com.rakuten.libman;

public class Student {
	private int id;
	private String name;
	private Address addr;

	public Student(int id, String name, Address addr) {
		this.id = id;
		this.name = name;
		this.addr = addr;
	}

	public void studentDetails() {
		System.out.println("id\tname\t\tCity\tState\tCountry");
		System.out.println(this.id+"\t"+this.name+"\t\t"+this.addr.city+"\t"+this.addr.state+"\t"+this.addr.country);
	}

}
