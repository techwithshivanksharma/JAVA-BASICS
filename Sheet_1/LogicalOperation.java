import java.util.Scanner;

public class LogicalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input two integers
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        // Step 2: Input logical operator
        System.out.print("Enter logical operator (& for AND, | for OR, ^ for XOR): ");
        char op = sc.next().charAt(0);

        int result = 0; // To store the result of logical operation

        // Step 3: Perform logical operation using if-else
        if (op == '&') {
            result = (a != 0 && b != 0) ? 1 : 0; // AND
        } else if (op == '|') {
            result = (a != 0 || b != 0) ? 1 : 0; // OR
        } else if (op == '^') {
            result = ((a != 0) ^ (b != 0)) ? 1 : 0; // XOR
        } else {
            System.out.println("Invalid operator!");
            sc.close();
            return;
        }

        System.out.println("Result of " + a + " " + op + " " + b + " = " + result);

        sc.close();
    }
}
