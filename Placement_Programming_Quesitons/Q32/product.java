package Q32;
import java.util.Scanner;
public class product {
    //product of numbers from x to y;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        if (x > y) {
            System.out.println("Invalid range");
        } else {
            int product = 1;
            for (int i = x; i <= y; i++) {
                product *= i;
            }
            System.out.println("Product of numbers from " + x + " to " + y + " is: " + product);
        }
        sc.close();
    }
    
}
