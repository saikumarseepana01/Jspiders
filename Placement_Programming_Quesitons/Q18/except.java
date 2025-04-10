package Q18;
import java.util.Scanner;
public class except{
    //reverse of numbers from n to 1 except x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the number to be excluded");
        int x = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            if (i == x) {
                continue;
            }
            System.out.print(i + " ");
        }
        sc.close();
    }
}