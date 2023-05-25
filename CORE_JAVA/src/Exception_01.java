import java.util.Scanner;

public class Exception_01{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numerator");
		int a=sc.nextInt();
		System.out.println("Enter The Denometor");
		int b=sc.nextInt();
		
		try {
			System.out.println(a/b);
		}
		catch(java.lang.ArithmeticException c) {
			c.printStackTrace();
		}
		System.out.println("abcdefgh");
		System.out.println("ijklmnop");
	}
}
