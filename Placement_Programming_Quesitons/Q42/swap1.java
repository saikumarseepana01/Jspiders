package Q42;
import java.util.Scanner;
public class swap1 {
    //swap two numbers without using a third variable
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a=a+b-(b=a);
        System.out.println("After swapping: a = " + a + ", b = " + b);
        sc.close();
    }
    
}
