

import java.util.Scanner;

import Car_Factory_design.Car;
public class Kia {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car c=null;
		do {
			System.out.println("CHoose a Car");
			System.out.println("1.Sedan\n2.HatchBack\3.SUV\n4.Exit");
			System.out.println("Enter your choice: [1-4]");
			int choice=sc.nextInt();
			switch (choice) {
			
			case 1{
				c=CarFactory.getCar("Sedan");
				System.out.println("Car Name: "+ c.getClass().getName());
				System.out.println("Car capcity: " + c.milaege());
				System.out.println("Car Type: "+ c.type());
				break;		
			}
			
		} while (condition);
		if (s.equals("SELTOS")) {
			c=new SELTOS();
		}
		else if (s.equals("CARENS")) {
			c=new CARENS();
		}
		if (c!=null) {
			
			
		}


	}

}
