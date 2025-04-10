package Q07;
import java.util.Scanner;
public class increment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the total number of numbers to be printed");
        int n= sc.nextInt();
        System.out.println("incrementing numbers from 0 to "+n+" are:");
        // incrementing numbers from 0 to n
        for (int i=0;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
    }
    
}
