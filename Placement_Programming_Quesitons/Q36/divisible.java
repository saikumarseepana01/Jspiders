package Q36;
import java.util.Scanner;
public class divisible {
    public static void main(String[] args) {
        //check divisible by x or not;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the divisor");
        int x = sc.nextInt();
        if (n % x == 0) {
            System.out.println(n + " is divisible by " + x);
        } else {
            System.out.println(n + " is not divisible by " + x);
        }
        sc.close();
    }
}
