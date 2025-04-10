package Q17;
import java.util.Scanner;
public class reverse{
    //reverse of numbers from n to 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}