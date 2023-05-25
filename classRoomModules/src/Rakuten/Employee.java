package Rakuten;

public class Employee {

		String name,designation;
		
		public Employee(String name, String designation) {
			this.name = name;
			this.designation = designation;
		}	
		//@override
		public String toString() {
			return this.name+"<->"+this.designation;
			}
		public static void main(String[]args) {
			Employee e=new Employee("manu","CEO");
			System.out.println("manu"+"<->" +"CEO");
}

}
