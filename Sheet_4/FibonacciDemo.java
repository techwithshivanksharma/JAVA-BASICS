// File: FibonacciDemo.java
public class FibonacciDemo {
    public static int fib(int n) {
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series: ");
        for(int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
