

import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumbersToFile {
	  public static void main(String[] args) {
	    int lowerBound = 1;
	    int upperBound = 20;

	    try {
	      FileWriter writer = new FileWriter("/Users/ts-manu.bs/Documents/manu.txt");
	      for (int num = lowerBound; num <= upperBound; num++) {
	        if (isPrime(num)) {
	          writer.write(num + "\n");
	        }
	      }
	      writer.close();
	      System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + " have been written to primes.txt");
	    } catch (IOException e) {
	      System.out.println("An error occurred while writing to the file.");
	      e.printStackTrace();
	    }
	  }

	  public static boolean isPrime(int num) {
	    if (num <= 1) {
	      return false;
	    }
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	      if (num % i == 0) {
	        return false;
	      }
	    }
	    return true;
	  }
	}



