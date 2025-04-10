package Q46;
import java.util.Scanner;
public class areas {
    //areas and perimeters of square /rectangle /circle/traiangle using switch case
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape (1 for square, 2 for rectangle, 3 for circle, 4 for triangle): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the side of the square: ");
                double side = sc.nextDouble();
                double areaSquare = side * side;
                double perimeterSquare = 4 * side;
                System.out.println("Area of square: " + areaSquare);
                System.out.println("Perimeter of square: " + perimeterSquare);
                break;
            case 2:
                System.out.println("Enter the length and breadth of the rectangle: ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                double areaRectangle = length * breadth;
                double perimeterRectangle = 2 * (length + breadth);
                System.out.println("Area of rectangle: " + areaRectangle);
                System.out.println("Perimeter of rectangle: " + perimeterRectangle);
                break;
            case 3:
                System.out.println("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                double areaCircle = Math.PI * radius * radius;
                double circumferenceCircle = 2 * Math.PI * radius;
                System.out.println("Area of circle: " + areaCircle);
                System.out.println("Circumference of circle: " + circumferenceCircle);
                break;
            case 4:
                System.out.println("Enter the base and height of the triangle: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of triangle: " + areaTriangle);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }

}
