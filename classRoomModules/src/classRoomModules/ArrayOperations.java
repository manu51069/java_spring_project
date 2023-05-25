package classRoomModules;

import java.util.Scanner;

public class ArrayOperations {

	public static void main(String[] args) {
		
     Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of the first Array: ");
		int falenth=scan.nextInt();
		int arr1[]=ArrayUtility.createarray(falenth);
		System.out.print("Enter the length of the second Array: ");
		int salenth=scan.nextInt();
		int arr2[]=ArrayUtility.createarray(salenth);
		int result[]=ArrayUtility.mergeArrays(arr1, arr2);
		ArrayUtility.dispplayArray(result);	
	
	}
}
