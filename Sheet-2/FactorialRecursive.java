import java.util.Scanner;

public class FactorialRecursive {
    
    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {   // Base condition
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        long result = factorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}
