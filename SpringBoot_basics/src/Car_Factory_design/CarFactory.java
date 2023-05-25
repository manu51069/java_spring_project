package Car_Factory_design;

public class CarFactory {
	static Car c=null;

	public static void main(String[] args) {
		if (carType.equals("sedan")) {
			c=new Carens();
			Carens ca=(Carens)c;
			return ca;
		}
		else if (carType.equals("HatchBack")) {
			c=new Seltos();
			Seltos ca=(Seltos)c;
			return ca;	
		}
		else if (carType.equals("SUV")) {
			c=new Carnival();
			
		}
		
		

	}

}
