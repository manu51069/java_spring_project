package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new TestEmployee(10,"jay",23));
		emplist.add(new TestEmployee(15,"ajay",21));
		emplist.add(new TestEmployee(16,"vijay",29));

		Collections.sort(emplist,new AgeComparator());

		Iterator<Employee>itr=emplist.iterator();
		while (itr.hasNext()) {
			Employee e = (Employee) itr.next();
			System.out.println(e.empid+"  |  "+e.empname+"  |  "+e.age);	
		}
	}
}
