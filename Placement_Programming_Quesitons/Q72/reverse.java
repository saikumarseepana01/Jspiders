package Q72;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        //reverse a string while maintaining the position of spaces
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = sc.nextLine();
        System.out.println("Reversed String :");
        for (int i =str.length()-1;i>=0;i--)
        {
            char b = str.charAt(i);
            System.out.print(b);
        }
        sc.close();
    }
}
