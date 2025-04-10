package Q31;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        //sum of numbers from  x to y ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        if (x > y) {
            System.out.println("Invalid range");
        } else {
            int sum = 0;
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            System.out.println("Sum of numbers from " + x + " to " + y + " is: " + sum);
        }
        sc.close();
    }
}
