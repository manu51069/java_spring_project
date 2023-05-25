
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Student1 implements Comparable<Student1>{
	int rollno;
	String name;
	int age;

	public Student1(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override

	public int compareTo(Student1 o) {
		if (this.age==o.age) {
			return 0;
		}
		else if(this.age>o.age){
			return 1;	
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {

		ArrayList<Student1>alist=new ArrayList<Student1>();
		alist.add(new Student1(100,"muthu",25));
		alist.add(new Student1(100,"manu",35));
		alist.add(new Student1(100,"muzzamil",45));
		alist.add(new Student1(100,"jaypaul",55));
		alist.add(new Student1(100,"abiniya",65));

		Collection.sort(alist);

		for(alist.size()){
			sys

		}
	}
}
