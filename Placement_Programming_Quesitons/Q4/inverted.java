package Q4;
import java.util.Scanner;
public class inverted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total number of rows to be printed");
        int n= sc.nextInt();
        System.out.println("inverted pyramid of numbers from 1 to "+n+" are:");
        // inverted pyramid of numbers
        for (int i = n; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print spaces 
            }
            for (int j = 1; j <= i; j++) {  // reverse pattern
            System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }

}
