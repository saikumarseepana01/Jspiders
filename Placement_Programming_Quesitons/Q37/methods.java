package Q37;
import java.util.Scanner;
public class methods {
    //methods for addition, subtraction, multiplication and division and reminder
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
        System.out.println("Reminder: " + modulus(a, b));
        sc.close();
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return a / b;
    }
    public static int modulus(int a, int b) {
        return a % b;
    }

    
}
