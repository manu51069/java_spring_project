package com.setter.injection;

public class Alpha {
	Beta b;
	public Alpha() {
		System.out.println("you have created an object of Alpha");
	}
	public Beta getBeta() {
		return b;
	}
	public void setBeta(Beta b) {
		this.b = b;
	}
	void print() {
		System.out.println("hello Alpha");
	}
	void displayDetails() {
		print();
		b.print();
	}
}
