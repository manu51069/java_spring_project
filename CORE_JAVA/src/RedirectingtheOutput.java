
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectingtheOutput {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream file=new PrintStream(new File("/Users/ts-manu.bs/Documents/manu.txt"));
		PrintStream console=System.out;
		
		System.setOut(file);
		System.out.println("welcome to bangalore");
		
		System.out.println(console);
		System.out.println("welcome to India");
		

	}

}
