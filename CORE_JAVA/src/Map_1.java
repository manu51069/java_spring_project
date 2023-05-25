
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> jercy=new HashMap<Integer,String>();
		jercy.put(07, "Dhoni");
		jercy.put(10,"Messi");
		jercy.put(18,"Rivaldo");
		jercy.put(18,"Ronaldino");
		jercy.put(18,"Maradona");

		//Way:1 Printing the Map Directly
		System.out.println(jercy);

		//Way:2 Iterrating throw entry set
		for(Map.Entry<Integer,String> m:jercy.entrySet()) {
			System.out.println(m.getKey()+"->"+m.getValue());
		}
		System.out.println();
		//Way:3 Iterating through key set and values
		System.out.println("printing keys");
		for(Integer k:jercy.keySet()) {
			System.out.println("Keys =:"+k);
		}
		System.out.println();
		System.out.println("Printing values");
		for(String S:jercy.values()) {
			System.out.println("values =:"+S);
		}

		//Way 4:Iterating through iterator 
		Iterator<Map.Entry<Integer,String>> itr=jercy.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Integer, String> e=itr.next();

			//System.out.println(itr.next());

			System.out.println("key :"+e.getKey()+"value :"+e.getValue());
		}
		System.out.println();
		System.out.println(".forEach");
		//Way :4 Iterating through .forEach() Method
		jercy.forEach((k,v)->System.out.println("key="+k+"value"+v));



		jercy.put(18, "Kohli");
		System.out.println(jercy);

		jercy.putIfAbsent(10, "kohli");
		System.out.println(jercy);
	}

}
