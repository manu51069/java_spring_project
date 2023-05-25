package classRoomModules;

import java.util.Scanner;

public class Interviewee {

	
	String name;
	int age;
	String qualification;
	String adress;
	String percentage;
	
	
	public Interviewee(String name, int age, String qualification, String adress, String percentage) {
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.adress = adress;
		this.percentage = percentage;
	}
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Interviewee: ");
		int count = scan.nextInt();
		Interviewee[] stu = new Interviewee[count];
		for(int i=0; i<count; i++) {
			System.out.println("Enter the name of Interviewee " + (i+1) + " : ");
			String name = scan.next();
			System.out.println("Enter the age of Interviewee " + (i+1) + " : ");
			int age = scan.nextInt();
			System.out.println("Enter the qualification of Interviewee " + (i+1) + " : ");
			String qualification = scan.next();
			System.out.println("Enter the adress of Interviewee " + (i+1) + " : ");
			String adress = scan.next();
			System.out.println("Enter the percentage of Interviewee " + (i+1) + " : ");
			String percentage = scan.next();
			Interviewee s = new Interviewee(name,age,qualification,adress,percentage);
			inter[m] = m;
		}
		System.out.println("-------------------------------------------");
		System.out.println("Name\t\tRollNo\t\tCity");
		System.out.println("-------------------------------------------");
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i].name+"\t\t"+stu[i].rollno+"\t\t"+stu[i].city);
		}
		System.out.println("-------------------------------------------");
	
	}

		
		
		
		
	
	
	
		
	
	
	
		
		

}

}


}
