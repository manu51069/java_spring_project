
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;


public class Product1 implements Comparable<Product1>{

	String productname;


	Product1(String productname) {
		this.productname = productname;

	}

	@Override
	public int compareTo(Product1 o) {
		return this.productname.compareTo(o.productname);
	}
	@Override
	public String toString() {

		return this.productname;
	}

	
	public static void main(String[]args) {
		ArrayList<Product1>plist=new ArrayList<Product1>();
		plist.add(new Product1("Mouse"));
		plist.add(new Product1("Keyboard"));
		plist.add(new Product1("Projector"));
		plist.add(new Product1("Harddisk"));
		plist.add(new Product1("Display"));
		Collections.sort(plist,Collections.reverseOrder());
		System.out.println(plist);
	}
} 

