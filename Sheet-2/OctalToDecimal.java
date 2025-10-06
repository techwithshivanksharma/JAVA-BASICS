import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input octal number
        System.out.print("Enter an Octal number: ");
        String octal = sc.next();

        // Convert octal → decimal
        int decimal = Integer.parseInt(octal, 8);

        // Output
        System.out.println("Decimal equivalent = " + decimal);

        sc.close();
    }
}
