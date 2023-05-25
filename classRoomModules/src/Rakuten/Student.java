package Rakuten;

public class Student {	
	String name, designation;
	int empno;
	double salary;


	public Employee1(String name, String designation,int empno, double salary) {
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
		Employee1 e1 = new Employee1("Manu", "CEO",12,567890.45);
		System.out.println(e1);
		Employee1 e2 = new Employee1("Muzzamil", "Manager",12,57890.45);
		System.out.println(e2);
	}
}