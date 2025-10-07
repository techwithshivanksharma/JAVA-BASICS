import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu for user
        System.out.println("Choose Conversion:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter choice (1 or 2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Binary to Decimal
                System.out.print("Enter a Binary number: ");
                String binary = sc.next();
                int decimal = Integer.parseInt(binary, 2);  // inbuilt conversion
                System.out.println("Decimal equivalent = " + decimal);
                break;

            case 2:
                // Decimal to Binary
                System.out.print("Enter a Decimal number: ");
                int decNum = sc.nextInt();
                String bin = Integer.toBinaryString(decNum); // inbuilt conversion
                System.out.println("Binary equivalent = " + bin);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
