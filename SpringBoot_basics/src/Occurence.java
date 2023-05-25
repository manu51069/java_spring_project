import java.util.HashMap;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        // create a hashmap to store the occurrence of each alphabet
        HashMap<Character, Integer> alphabetOccurrence = new HashMap<>();
        // initialize the hashmap with all the alphabets in "muzzamil"
        String muzzamil = "muzzamil";
        for (char c : muzzamil.toCharArray()) {
            alphabetOccurrence.put(c, 0);
        }
        // take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        // iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // check if the character is present in "muzzamil"
            if (alphabetOccurrence.containsKey(c)) {
                // increment the occurrence count for this character
                alphabetOccurrence.put(c, alphabetOccurrence.get(c) + 1);
            }
        }
        // print the occurrence count for each alphabet in "muzzamil"
        for (char c : muzzamil.toCharArray()) {
            int count = alphabetOccurrence.get(c);
            System.out.println(c + ": " + count);
        }
    }
}
