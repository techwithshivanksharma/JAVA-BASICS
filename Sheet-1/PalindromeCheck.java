import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = (int)(num % 10);     
            reverse = reverse * 10 + digit;  
            num = num / 10;                  
        }

    
        if (original == reverse) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
