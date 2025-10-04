import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;  // Make it positive
        }

        int digits = 0;

        if (num == 0) {
            digits = 1;  // 0 has 1 digit
        } else {
            while (num > 0) {
                num = num / 10;  // Remove last digit
                digits++;
            }
        }

        // Display result
        System.out.println("Number of digits = " + digits);

        sc.close();
    }
}
