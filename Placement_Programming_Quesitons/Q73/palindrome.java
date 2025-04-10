package Q73;
import java.util.Scanner;
// Java program to check if a string is palindrome or not

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value : ");
        String str= sc.nextLine();
        if(isPalidrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");

        }
        sc.close();
    }
    public static boolean isPalidrome(String Name){
        boolean b= false ;
        String rev="";
        for (int i = 0;i<Name.length();i++)
        {
            char c = Name.charAt(i);
            rev=c+rev;
        }
        if(rev.equalsIgnoreCase(Name)) {
            b= true;
        }
        return b;
    }
}
