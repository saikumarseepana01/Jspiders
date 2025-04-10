package Q05;
// Floyd's Triangle is a right-angled triangular array of natural numbers.
import java.util.Scanner;

public class floyd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int rows = scanner.nextInt();

        int number = 1;

        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

        scanner.close();
    }
}