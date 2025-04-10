package Q45;
import java.util.Scanner;
public class exponential {
    public static void main(String[] args) {
        //calculate the exponential value of a given base and power
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        int base = sc.nextInt();
        System.out.println("Enter the power");
        int power = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("The exponential value of " + base + " raised to the power of " + power + " is " + result);
        sc.close();
    }
}
