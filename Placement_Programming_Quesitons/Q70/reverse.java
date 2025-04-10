//reverse a string without using build-in methods
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String str = sc.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }

}
