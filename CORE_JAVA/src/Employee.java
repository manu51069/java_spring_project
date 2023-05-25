public class Employee {
	
	String name;
	int empid;
	double salary;
	String dept;
	int age;
	
	

public Employee(String name, int empid, double salary, String dept, int age) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}



@Override
public String toString() {
	
	return this.name +"  |  "+ this.empid+"  |  "+"  |  "+ this.salary+"  |  "+ this.dept;	
}	
	
}
