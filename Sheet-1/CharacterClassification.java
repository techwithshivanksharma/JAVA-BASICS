import java.util.Scanner;

public class CharacterClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read first character

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is a special character.");
        }

        sc.close();
    }
}
