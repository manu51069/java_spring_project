package collections;

public class Softdrinks {
	public static void main(String[] args) {

		//Anonymous inner class
		Drinkable d=new Drinkable() {

			@Override
			public void dinks(String name) {
				System.out.println("<Manu drinks Soft Drinks"+name);
			}
		};
		d.drinks("bear");

		Drinkable d1=(drink)-> {
			System.out.println("Manu dinks"+drink);
			System.err.println("Even though manu drinks"+drink+",he won't vomit");	
		};
		d1.drinks("wine")
	}
}
