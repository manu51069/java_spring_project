

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_Iterator {
	
		String name;
		int rollno;

		public Array_list_Iterator(String name, int rollno) {
			super();
			this.name = name;
			this.rollno = rollno;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name+"|"+this.rollno;
		}

		public static void main(String[] args) {
			ArrayList<Array_list_Iterator> al=new ArrayList<Array_list_Iterator>();
			al.add(new Array_list_Iterator("muzammil", 10));
			al.add(new Array_list_Iterator("manu", 10));
			al.add(new Array_list_Iterator("jayepaul", 10));
			System.out.println(al);
			
			System.out.println("Printing using for loop and get() method of arraylist");
			for(int i=0;i<al.size();i++) {
				System.out.println(al.get(i));
			}

			System.out.println("Printing using for each loop");
			for(Array_list_Iterator a:al) {
				System.out.println(a);
			}
			System.out.println("Printing using itorator");
			Iterator<Array_list_Iterator> it=al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("new");
			Object[] obj=al.toArray();
			for(Object o:al) {
				System.out.println(o);
			}
			
		}

	}


