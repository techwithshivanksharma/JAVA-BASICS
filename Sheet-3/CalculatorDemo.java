import java.util.Scanner;

class Calculator {

    // Method to add two numbers
    double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nResults:");
        System.out.println("Addition       : " + calc.add(num1, num2));
        System.out.println("Subtraction    : " + calc.subtract(num1, num2));
        System.out.println("Multiplication : " + calc.multiply(num1, num2));
        System.out.println("Division       : " + calc.divide(num1, num2));

        sc.close();
    }
}
