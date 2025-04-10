package Q30;
import java.util.*;
// import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        //sum of numbers from 1 to n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}
