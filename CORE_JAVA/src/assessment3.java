//Implement simple shopping cart using Map. Using shopping car, 
//the user should be able to add, remove, search for items in the cart.

package DataString;
import java.io.*;
import java.util.*;




public class ShoppingCart {
	public static void main(String[] args) throws IOException 
	{
		//create HashMap
		HashMap<String,Long> hm = new HashMap <String,Long>();
		
		//variables
		String name,str;
		Long price;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//menu
		while(true)
		{
			System.out.println("1 Adding car & its price into cart : ");
			System.out.println("2 Search in the Cart: ");
			System.out.println("3 Display Car names: ");
			System.out.println("4 Removing Car name from Cart: ");
			System.out.println("5 Exit ");
			
			System.out.println("Enter your choice: ");
			int n=Integer.parseInt(br.readLine());
			
			switch(n)
			{
			
			 case 1:
				  System.out.println("Enter Car name: ");
				   name=br.readLine();
				  System.out.println("Enter Car Price: ");
				   str=br.readLine();
				   price=new Long(str);
				   //store car name and Price into HashMap 
				   hm.put(name, price);
				   break;
			  case 2:
				  System.out.println("Enter Car name: ");
				   name=br.readLine();
				   name=name.trim();   //remove unnecessary spaces
				   //pass name and get prices
				   price=hm.get(name);
				  System.out.println("Price: "+ price);
				   break;
			  case 3:
				  //use KeySet() to display the names
				  //create HashSet object to store names and refer it by Set reference
				  Set<String> set = new HashSet<String>();
				  set = hm.keySet();
				  System.out.println(set);
				   break;
			  case 4:
				  System.out.println("Enter Car name to be removed from Cart1: ");
				   name=br.readLine();
				   hm.remove(name);
				   System.out.println(name+" is removed from Cart");
				   break;
  
			  case 5: 
				  System.exit(0);

				  
			}
		}
	}
	
}