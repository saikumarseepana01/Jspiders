package Q54;
import java.util.Scanner;

public class arraycheck {
    public static void main(String[] args) {
       //even elements of the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The even elements of the array are:");
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        // odd elements of the array
        System.out.println("\nThe odd elements of the array are:"); 
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        //elements at even index
        System.out.println("\nThe elements at even index are:");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        //elements at odd index
        System.out.println("\nThe elements at odd index are:");
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    } 
}
