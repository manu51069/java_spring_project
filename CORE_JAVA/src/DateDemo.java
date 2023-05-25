

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateDemo{
	
	public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	LocalDate test=LocalDate.now();
	
	DateTimeFormatter sample = DateTimeFormatter.ofPattern("dd-MM-YYYY");
	String printer=test.format(sample);
	System.out.println(printer);

	//day of week
	System.out.println(test.getDayOfWeek());
	System.out.println(today.getDayOfMonth());
	System.out.println(test.getDayOfYear());
	System.out.println();

	//extract month information
	System.out.println(test.getMonth());
	System.out.println(test.getMonthValue());
	System.out.println();

	//extract year
	System.out.println(test.getYear());

	LocalDate jeyam = LocalDate.of(1990, 1, 21);
	System.out.println(jeyam);
	System.out.println(jeyam.getDayOfWeek());

	// check condition

	LocalDate lover =LocalDate.of(2023, 2, 14);
	System.out.println(lover.isAfter(jeyam));
	System.out.println(jeyam.isAfter(lover));



	//Date Difference 

	Period p= Period.between(jeyam, lover);
	//	System.out.println("Number of Days Between :"+p.getYears()"Years  "+p.getMonths()+"Months"  );

	System.out.println("Number Of Days Between   "+p.getYears()+" Years  "+p.getMonths()+" Moths  "
			+p.getDays()+" Days ");		   



	/* create a product class with neccasary attibute and dipalay
	 * in the format
	 * 
	 * 
	 */
	//LocalDate today=LocalDate.now();
	System.out.println("----------------------------------------------");
	System.out.println("Date"+today);
	System.out.println("----------------------------------------------");
}
}


