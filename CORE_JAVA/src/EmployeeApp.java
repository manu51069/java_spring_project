	import java.util.ArrayList;
	import java.util.Scanner;

	class Department {
	    private int did;
	    private String dname;
	    private String designation;

	    public Department(int did, String dname, String designation) {
	        this.did = did;
	        this.dname = dname;
	        this.designation = designation;
	    }

	    public int getDid() {
	        return did;
	    }

	    public String getDname() {
	        return dname;
	    }

	    public String getDesignation() {
	        return designation;
	    }
	}

	class Employee5 {
	    private int eid;
	    private String ename;
	    private Department department;

	    public Employee5(int eid, String ename, Department department) {
	        this.eid = eid;
	        this.ename = ename;
	        this.department = department;
	    }

	    public int getEid() {
	        return eid;
	    }

	    public String getEname() {
	        return ename;
	    }

	    public Department getDepartment() {
	        return department;
	    }
	}

	public class EmployeeApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Employee> employees = new ArrayList<>();

	        for (int i = 1; i <= 3; i++) {
	            System.out.println("Enter Employee " + i + " details:");
	            System.out.print("Employee ID: ");
	            int eid = sc.nextInt();
	            System.out.print("Employee Name: ");
	            String ename = sc.next();

	            System.out.println("Enter Department details:");
	            System.out.print("Department ID: ");
	            int did = sc.nextInt();
	            System.out.print("Department Name: ");
	            String dname = sc.next();
	            System.out.print("Designation: ");
	            String designation = sc.next();

	            Department department = new Department(did, dname, designation);
	            Employee employee = new Employee(eid, ename, department);

	            employees.add(employee);
	        }

	        System.out.println("Employee details:");
	        for (Employee employee : employees) {
	            System.out.println("Employee ID: " + employee.getEid());
	            System.out.println("Employee Name: " + employee.getEname());
	            System.out.println("Department ID: " + employee.getDepartment().getDid());
	            System.out.println("Department Name: " + employee.getDepartment().getDname());
	            System.out.println("Designation: " + employee.getDepartment().getDesignation());
	            System.out.println();
	        }
	    }
	}

	
	
