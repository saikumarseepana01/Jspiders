package Q16;
import java.util.*;
public class natural {
    //natural numbers from 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number :");
        int n = sc.nextInt();
        System.out.println("Natural numbers from 1 to " + n + " are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
    
}
