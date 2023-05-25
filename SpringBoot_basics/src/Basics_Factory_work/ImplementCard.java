package Basics_Factory_work;
import java.util.Scanner;


public class ImplementCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		CreditCard ccard=null;
		System.err.println("Enter the name of card");
		String ctype=scan.next();
		if (ctype.equals("Platinum")) 
			CardFactory cf=new PlatinumFactory();
			ccard=cf.createProduct();
		}
		else if(ctype.equals("MoneyBack"){
			CardFactory cf=new MoneyBackFactory().createProduct();
			}
		else if (cca) {
			
		}
			
		
		}

	}

}
