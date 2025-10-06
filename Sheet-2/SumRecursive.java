import java.util.Scanner;

public class SumRecursive {

    // Recursive method to calculate sum from 1 to n
    public static int sum(int n) {
        if (n == 1) {   // Base condition
            return 1;
        } else {
            return n + sum(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int num = sc.nextInt();

        int result = sum(num);

        System.out.println("Sum of numbers from 1 to " + num + " = " + result);

        sc.close();
    }
}
