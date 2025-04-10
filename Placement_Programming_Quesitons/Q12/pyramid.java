package Q12;
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        //pyramid of stars
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed:");
        int n = sc.nextInt();
        System.out.println("Pyramid of stars:");
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //pyramid of numbers
        sc.close();
    }
    
}
