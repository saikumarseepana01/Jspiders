package Q22;
import java.util.Scanner;
public class range {
    public static void main(String[] args) {
        // natural numbers from x to y ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        if (x > y) {
            System.out.println("Invalid range");
        } else {
            for (int i = x; i <= y; i++) {
                System.out.print(i + " ");
            }
        }   
        //even numbers from x to y ;
        System.out.println("\nEven numbers from " + x + " to " + y + ":");
        if (x % 2 != 0) {
            x++;
        }
        for (int i = x; i <= y; i += 2) {
            System.out.print(i + " ");
        }
        //odd numbers from x to y ;
        System.out.println("\nOdd numbers from " + x + " to " + y + ":");
        if (x % 2 == 0) {
            x++;
        }
        for (int i = x; i <= y; i += 2) {
            System.out.print(i + " ");
        }
        //divisible by x ;
        System.out.println("\nNumbers divisible by " + x + " from " + x + " to " + y + ":");
        for (int i = x; i <= y; i++) {
            if (i % x == 0) {
                System.out.print(i + " ");
            }
        }
        
        sc.close();
    }
}
