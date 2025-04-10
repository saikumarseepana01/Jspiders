package Q75;
import java.util.*;
//frequency of each string
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //frequency of the each character of the string 
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Character frequencies:");
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 0;

            // Count occurrences of currentChar
            for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == currentChar) {
                count++;
            }
            }

            // Check if the character has already been printed
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
            if (input.charAt(k) == currentChar) {
                alreadyPrinted = true;
                break;
            }
            }

            if (!alreadyPrinted) {
            System.out.println(currentChar + ": " + count);
            }
        }
        sc.close();
    }
}
