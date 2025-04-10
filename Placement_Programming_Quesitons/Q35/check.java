package Q35;
import java.util.Scanner;
public class check {
    //check even or odd number;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
        sc.close();
    }
    
}
