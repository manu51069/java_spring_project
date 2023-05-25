
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputToFile {
	
	

	public static void main(String[] args) {
		try {
			FileOutputStream fout= new FileOutputStream("/Users/ts-manu.bs/Desktop/manu_string.txt");
	        String s="Smells Like Teen Spirit - Nirvana (1991)";
			fout.write(s.getBytes());
			fout.flush();
			fout.close();
			System.out.println("success");
		}
	catch(FileNotFoundException e) {
		System.out.println("Failed due to"+e.getMessage());
		}
    catch(IOException ioe) {
			System.out.println("Failed due to"+ioe.getMessage());
    }
	}
}
