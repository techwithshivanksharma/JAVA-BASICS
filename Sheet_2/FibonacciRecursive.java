import java.util.Scanner;

public class FibonacciRecursive {

    // Recursive method to calculate nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {        // Base case 1
            return 0;
        } else if (n == 1) { // Base case 2
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive relation
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n (position in Fibonacci sequence): ");
        int n = sc.nextInt();

        int result = fibonacci(n);

        System.out.println("Fibonacci number at position " + n + " = " + result);

        sc.close();
    }
}
