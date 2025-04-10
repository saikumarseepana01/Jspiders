package Q3;
public class pyramid{
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for (int i = 1; i <= n; i++) {
            count = 1;
            for (int s = 1; s <= n - i; s++) {// for spaces 
            System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {    // increment 
            System.out.print(count);
            count++;
            }
            count -= 2;
            for (int j = 1; j < i; j++) {     // decrement
            System.out.print(count);
            count--;
            }
            System.out.println();
        }
    }
}
