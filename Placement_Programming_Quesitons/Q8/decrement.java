package Q8;
import java.util.Scanner;
// Decrementing numbers from n to 0
// This program takes an integer input from the user and prints the numbers in decrementing order from that number to 0.
public class decrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of numbers to be printed in decrementing order:");
        int n = sc.nextInt(); // User input for the starting number
        System.out.println("Decrementing numbers from " + n + " to 0 are:");
        // Decrementing numbers from n to 0
        for (int i = n; i >= 0; i--) {
            System.out.println(i); // Print the current number
        }
        sc.close();
    }
}
