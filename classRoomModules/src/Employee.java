/*Create a class called as Employee and create two instance varibles called name, designation
create 2 employee objects and print the reference variables to get the following output

name <-> designation
 * */
//package com.rakuten.ems.Overriding;

public class Employee {
	String name, designation;
	int empno;
	double salary;


	public Employee(String name, String designation, int empno, double salary) {
		this.name = name;
		this.designation = designation;
		this.empno = empno;
		this.salary = salary;
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ID\t\tName\t\tDesig\t\tSalary");
		System.out.println("---------------------------------------------------------------------");
	}

	@Override
	public String toString() {
		return this.empno+"\t\t"+this.name+"\t\t"+this.designation+"\t\t"+this.salary +
		"\n---------------------------------------------------------------------";
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Manu", "CEO",12,567890.45);
		System.out.println(e1);
		Employee e2 = new Employee("Muthu", "Manager",12,57890.45);
		System.out.println(e2);
	}
}
/*
---------------------------------------------------------------------
ID		Name		Desig		Salary
---------------------------------------------------------------------
12		Manu		CEO			567890.45
---------------------------------------------------------------------
---------------------------------------------------------------------
ID		Name		Desig		Salary
---------------------------------------------------------------------
13		Muthu		Manager 	57890.45
---------------------------------------------------------------------


 */
