
import java.util.ArrayList;
import java.util.Scanner;

public class Products {

	int Pid;
	String ProdName;
	int qty;
	double price;


	public Products(int pid, String prodName, int qty, double price) {
		super();
		Pid = pid;
		ProdName = prodName;
		this.qty = qty;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.Pid +" | " + this.ProdName + " | " + this.qty + " | " + this.price;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Products> prlist = new ArrayList<Products>();
		System.out.println("Enter the number of");
		int count = sc.nextInt();
		for(int i=0; i<count; i++) {
			System.out.println("Enter the produc id");
			int pid=sc.nextInt();
			System.out.println("Enter the produc name");
			String prodName=sc.next();
			System.out.println("Enter the quantity");
			int qty=sc.nextInt();
			System.out.println("Enter the Price");
			double price =sc.nextDouble();
			prlist.add(new Products(pid,prodName,qty,price));


		}

		System.out.println(prlist);
	}
}
