package Q71;
import java.util.Scanner;
public class reverse {
    // reverse each word of the string individually
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = sc.nextLine();
        String reversedString = "";
        String word = "";

        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                reversedString += new StringBuilder(word).reverse().toString() + " ";
                word = ""; // Clear the word
            } else {
                word += ch;
            }
        }
        reversedString += new StringBuilder(word).reverse().toString(); // Reverse and append the last word

        System.out.println("Reversed string: " + reversedString);
        sc.close();
    }
}
