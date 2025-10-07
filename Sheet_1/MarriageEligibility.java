import java.util.Scanner;

public class MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter gender (male/female): ");
        String gender = sc.next().toLowerCase();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (gender.equals("male")) {
            if (age >= 21) {
                System.out.println("You are eligible for marriage.");
            } else {
                System.out.println("You are NOT eligible for marriage. Minimum age is 21.");
            }
        } else if (gender.equals("female")) {
            if (age >= 18) {
                System.out.println("You are eligible for marriage.");
            } else {
                System.out.println("You are NOT eligible for marriage. Minimum age is 18.");
            }
        } else {
            System.out.println("Invalid gender input! Please enter male or female.");
        }

        sc.close();
    }
}
