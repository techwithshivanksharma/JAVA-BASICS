import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Input operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;

        // Perform calculation using if-else
        if (op == '+') {
            result = num1 + num2;
            System.out.println("Result = " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("Result = " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Result = " + result);
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
