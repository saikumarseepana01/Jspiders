package Q59;
import java.util.Scanner;

public class arith_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of all elements: " + sum(arr));
        System.out.println("Sum of all even elements: " + sumEven(arr));
        System.out.println("Sum of all odd elements: " + sumOdd(arr));
        System.out.println("Sum of first and last elements: " + sumFirstLast(arr));
        System.out.println("Sum of last two elements: " + sumLastTwo(arr));
        System.out.println("Multiplication of all elements: " + multiply(arr));
        System.out.println("Average value of all elements: " + average(arr));
        System.out.println("Largest element: " + largest(arr));
        System.out.println("Smallest element: " + smallest(arr));
        System.out.println("Second largest element: " + secondLargest(arr));
        System.out.println("Second smallest element: " + secondSmallest(arr));
        sc.close();
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static int sumEven(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumOdd(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static int sumFirstLast(int[] arr) {
        return arr[0] + arr[arr.length - 1];
    }

    public static int sumLastTwo(int[] arr) {
        return arr[arr.length - 1] + arr[arr.length - 2];
    }

    public static int multiply(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int largest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int smallest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static int secondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }
        return secondMin;
    }
}
