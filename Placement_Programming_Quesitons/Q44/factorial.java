package Q44;
import java.util.Scanner;
public class factorial {
    //factorial of a number 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + n + " is " + fact);
        sc.close();
    }
}
