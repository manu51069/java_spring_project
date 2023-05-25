
public class Box {int weight= 845;
static int height = 45;
void open() {
	System.out.println(height);
	System.out.println(weight);
	class Test{
		static int age =34;
		String name = "welcome";

		void display() {
			System.out.println(age);
			System.out.println(name);
		}
	}
	Test t= new Test();
	t.display();

}
static void display() {
	System.out.println(height);
	Box b=new Box();
	System.out.println(b.weight);

	class Laptop {
		int price = 45664;
		static String make="DELL";

		void display() {
			System.out.println(price);
		}
		static void show() {
			Laptop l= new Laptop();
			l.display();
		}
	}
	Laptop.show();

}
public static void main(String[] args) {
	Box b=new Box();
	b.open();
}	
}


