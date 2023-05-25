
import java.util.HashSet;
import java.util.Iterator;

public class HSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs=new HashSet<String>();
		hs.add("manu");
		hs.add("guru");
		hs.add("raju");
		hs.add("ravi");
		hs.add("manu");
		hs.add("raju");     
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.contains("raju"));

		//for (int i=0;i<hs.size();i++){
		//System.out.println(hs.get(i));
		//}

		for(String s:hs) {
			System.out.println(s);
		}
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
