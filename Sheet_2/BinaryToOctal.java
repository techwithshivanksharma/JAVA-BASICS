import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input binary number
        System.out.print("Enter a Binary number: ");
        String binary = sc.next();

        // Convert binary → decimal
        int decimal = Integer.parseInt(binary, 2);

        // Convert decimal → octal
        String octal = Integer.toOctalString(decimal);

        // Output
        System.out.println("Octal equivalent = " + octal);

        sc.close();
    }
}
