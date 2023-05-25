
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyMapBooks {
	


		public static void main(String[] args) {

			Map<Integer,Books> addBooks = new HashMap<Integer,Books>();
			addBooks.put(1, new Books("Science"));
			addBooks.put(2, new Books("English"));
			addBooks.put(3, new Books("Novels"));
			addBooks.put(4, new Books("History"));

			System.out.println("Way 1:Printing the map dirrectly");
			System.out.println(addBooks);
			System.out.println();

			System.out.println("Way 2:Iterating through Entryset");
			for(Map.Entry<Integer, Books> ib: addBooks.entrySet()) {
				System.out.println(ib.getKey()+"-->"+ib.getValue());
			}

			System.out.println();
			System.out.println("Way 3: iterating through keyset and values");

			System.out.println("Printing Keys");
			for(Integer k:addBooks.keySet()) {
				System.out.println("keys="+k);
			}
			System.out.println("Printing Values");
			for(Books k:addBooks.values()) {
				System.out.println("values="+k);
			}

			System.out.println();
			System.out.println("Way 4:Iterating throuh Iterator interface");
			Iterator<Map.Entry<Integer,Books>> itr = addBooks.entrySet().iterator();
			
			while(itr.hasNext()) {
				Entry<Integer,Books> ib = itr.next();
				System.out.println("key="+ib.getKey()+" | values="+ib.getValue());
			}
			
			System.out.println("Way 5: Iterating through .forEach()");
			addBooks.forEach((k,v)->System.out.println("Key="+k+"  Value="+v));
			
			
		}

	}
	


