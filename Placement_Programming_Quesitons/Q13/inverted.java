package Q13;
// Inverted pyramid of stars
import java.util.Scanner;

public class inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int a = sc.nextInt();

        for (int i = a; i >= 1; i--) { // Outer loop for rows
            for (int j = 1; j <= a - i; j++) { // Loop for spaces
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // Loop for stars
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
        sc.close();
    }
}
