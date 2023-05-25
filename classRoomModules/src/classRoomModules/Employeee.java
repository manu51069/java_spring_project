package classRoomModules;

import java.util.Scanner;

public class Employeee {


	String empname;
	int empid;
	double salary;
	String designation;
	String department;
	String empaddress;
	long mobileno;
	String dob;
	String doj;
	
	public Employeee(String name, int empno, double sal, String desig, String dept,
					String address, long contact, String bday, String join) {
		empname = name;
		empid = empno;
		salary = sal;
		designation = desig;
		department = dept;
		empaddress = address;
		mobileno = contact;
		dob = bday;
		doj = join;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String empname = scan.next();
		System.out.println("Enter Employee Id: ");
		int empid = scan.nextInt();
		System.out.println("Enter Employee Designation: ");
		String desig = scan.next();
		System.out.println("Enter Employee Salary: ");
		double sal = scan.nextDouble();
		System.out.println("Enter Employee Department: ");
		String dept = scan.next();
		System.out.println("Enter Employee Mobile No: ");
		long mobile = scan.nextLong();
		System.out.println("Enter Employee Address: ");
		String address= scan.next();
		System.out.println("Enter Employee Date of Birth: ");
		String dob = scan.next();
		System.out.println("Enter Employee Date of Joining: ");
		String doj = scan.next();
		
		Employeee e = new Employeee(empname, empid, sal, desig, dept, address, mobile, dob, doj);		
		System.out.println("Employee Data:");
		System.out.println("Enter Employee Name: " + e.empname);
		System.out.println("Enter Employee Id: " + e.empid);
		System.out.println("Enter Employee Designation: "+ e.designation);
		System.out.println("Enter Employee Salary: "+e.salary);
		System.out.println("Enter Employee Department: "+e.department);
		System.out.println("Enter Employee Mobile No: "+e.mobileno);
		System.out.println("Enter Employee Address: "+e.empaddress);
		System.out.println("Enter Employee Date of Birth: "+e.dob);
		System.out.println("Enter Employee Date of Joining: "+e.doj);
	}


}
