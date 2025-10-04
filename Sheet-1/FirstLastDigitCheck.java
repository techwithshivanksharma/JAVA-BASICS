import java.util.Scanner;

public class FirstLastDigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("Invalid input! Please enter a five-digit number.");
            sc.close();
            return;
        }

        int lastDigit = (int)(num % 10);

        int firstDigit = (int)(num / 10000);  

        if (firstDigit == lastDigit) {
            System.out.println("The first and last digits are the SAME.");
        } else {
            System.out.println("The first and last digits are DIFFERENT.");
        }

        sc.close();
    }
}
