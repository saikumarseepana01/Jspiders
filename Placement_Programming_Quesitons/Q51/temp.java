package Q51;

import java.util.Scanner;
// This program demonstrates temperature conversions between Celsius and Fahrenheit.
public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Conversion Program");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option (1-6): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                celsius = sc.nextDouble();
                double kelvin = celsius + 273.15;
                System.out.println("Temperature in Kelvin: " + kelvin);
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                kelvin = sc.nextDouble();
                celsius = kelvin - 273.15;
                System.out.println("Temperature in Celsius: " + celsius);
                break;
            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
                System.out.println("Temperature in Kelvin: " + kelvin);
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                kelvin = sc.nextDouble();
                fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            default:
                System.out.println("Invalid choice. Please restart the program.");
        }
        sc.close();
    }
}
