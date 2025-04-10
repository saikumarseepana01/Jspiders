package Q10;
import java.util.Scanner;
public class inverted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of rows to be printed:");
        int n = sc.nextInt();
        System.out.println("Reverse triangle of stars:");
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
