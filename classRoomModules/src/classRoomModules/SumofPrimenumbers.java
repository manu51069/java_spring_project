package classRoomModules;

import java.util.Scanner;

public class SumofPrimenumbers {
	

	static boolean isPrime(int n){
		int factor=0;
		for(int i=1;i<=n;i++) {
			if(n%i==1) {
				factor ++;
			}
	}
	if(factor==2){
		return true;
	}
	else {
		return false;
	}


	public static void main(String[] args) {

		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=2;i++) {
			if(isPrime(i) && isPrime(n-1)) {
				System.out.println(n+"="+i+"+"+(n-1));
				
			}
		}
	}
}
			

	
