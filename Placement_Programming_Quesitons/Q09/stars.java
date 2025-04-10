package Q09;
import java.util.Scanner;
public class stars{
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows to be printed");
        int n= sc.nextInt();
        System.out.println("printing stars in the form of right angle triangle");
        // printing stars in the form of right angle triangle
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
 }