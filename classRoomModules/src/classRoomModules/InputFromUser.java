package classRoomModules;

import java.util.Scanner;

public class InputFromUser {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a byte value");
		byte b=scan.nextByte();
		System.out.println("Enter a integer value");
		int i=scan.nextInt();
		System.out.println("Enter a long value");
		long l=scan.nextLong();
		System.out.println("Enter a float value");
		float f=scan.nextFloat();
		System.out.println(" Enter a string 1 value");
		String s1=scan.next();
		System.out.println(" Enter a string 2 value");
		scan.nextLine();
		String s2=scan.nextLine();		
		System.out.println(" Enter a char value");
		char ch=scan.next().charAt(0);
	}
}
