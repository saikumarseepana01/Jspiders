package Q34;
import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        //check positive or negative number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " is a positive number");
        } else if (n < 0) {
            System.out.println(n + " is a negative number");
        } else {
            System.out.println("The number is zero");
        }
        sc.close();
    }  
}
