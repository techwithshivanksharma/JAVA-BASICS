import java.util.Scanner;

public class PalindromeRecursive {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: agar start >= end, string palindrome hai
        if (start >= end) {
            return true;
        }
        // Agar first aur last character match nahi karte → not palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        // Recursive call (andar ka substring check karte hain)
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call recursive method
        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        sc.close();
    }
}
