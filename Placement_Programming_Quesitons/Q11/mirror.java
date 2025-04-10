package Q11;
import java.util.Scanner;
public class mirror {
    public static void main(String[] args) {
        System.out.println("Mirror image of a right angle triangle");
        System.out.println("Enter the number of rows to be printed:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int n = 5; // Number of rows
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
