package com.rakuten.libman;

public class Candidates {
	private static final String ID = null;
	private int id;
	private String name;
	
	public Candidates() {
		System.out.println("empty Constuctor");
	}
public Candidates (int id) {
	this.id=id;
}
public Candidates (String name) {
	this.name=name;
}
public Candidates (int id,String name) {
	this.id=id;
	this.name=name;
}
public void displayDetails() {
	System.out.println("ID\t\t|Name");
	System.out.println(this.id+"\t\t"+this.name);
}

}
