import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Find square
        int square = num * num;

        // Find sum of digits of square
        int sum = 0;
        while (square > 0) {
            int digit = square % 10;  // extract last digit
            sum += digit;             // add to sum
            square /= 10;             // remove last digit
        }

        // Check for Neon Number
        if (sum == num) {
            System.out.println(num + " is a Neon Number.");
        } else {
            System.out.println(num + " is NOT a Neon Number.");
        }

        sc.close();
    }
}
