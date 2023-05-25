
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingArraylist1 {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>(10);
		al.add("manu");
		al.add("jeyapaul");
		al.add("muzzamil");
		al.add("abiniya");

		System.out.println("Array list before sorting");
		System.out.println(al);	
		Collections.sort(al);
		System.out.println("Array list after sorting");
		System.out.println(al);	
		System.out.println("Display array list in reverse order");
		Collections.reverse(al);
		System.out.println(al);	


		ArrayList<Integer>alist=new ArrayList<Integer>();
		alist.add(23);
		alist.add(33);
		alist.add(45);
		alist.add(26);
		alist.add(201);
		System.out.println(al);
		System.out.println("sorting the array in reverse order using Collection reverse Order()");
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println(alist);
	}

}
