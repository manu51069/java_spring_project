package com.rakuten.libman;

public class Products {
	int id;
	String name;
	double price;
	boolean isAavilable;
	companyAddress company;

	public Products(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Products(int id, String name, double price,boolean isAavilable, companyAddress company) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.isAavilable = isAavilable;
		this.company = company;
	}
	public void displayProducts() {
		System.out.println("id\tname\tprice\tisAvailable");
		System.out.println(this.id+"\t"+this.name+"\t\t"+this.isAavilable+this.company+"\t"+this.company.Location);
		
	}

}
