package classRoomModules;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("choose options from the below");
		
		do {
			System.out.println("1.yawn\n2.s snore\n3."+"sleep walking\n4.nightmare\n5.Exit");
			System.out.println("Enter your choice[1-5]:");
			
			int choice=sc.nextInt();
			switch (choice){
			case 1:
				System.out.println("have curd rice and yawn");
				break;
			case 2:
				System.out.println("snore untill the lion gets afraid");
				break;
			case 3:
				System.out.println("walk untill you become a zombie");
				break;
			case 4:
				System.out.println("walk untill you become a zombie");
				break;
			case 5:
				System.out.println("Thank you for wonderful coaperation");
				return;
				default:
					System.out.println("Exit");
		}
		}
		while(true);
	}
}
	


