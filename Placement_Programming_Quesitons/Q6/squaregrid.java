package Q6;
import java.util.Scanner;
// Square Grid Pattern
public class squaregrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square grid: ");
        int n = scanner.nextInt(); // Size of the square grid

        for (int i = 1; i <= n; i++) {
           
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
