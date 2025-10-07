import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int sum = 0;

        int digit1 = num / 100;         // Hundreds place
        int digit2 = (num / 10) % 10;   // Tens place
        int digit3 = num % 10;          // Units place

        sum = (digit1 * digit1 * digit1) + 
              (digit2 * digit2 * digit2) + 
              (digit3 * digit3 * digit3);

        if (sum == originalNum) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }

        sc.close();
    }
}
