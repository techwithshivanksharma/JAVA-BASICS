import java.util.Scanner;

public class CharToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read first character of input

        int ascii = (int) ch;

        System.out.println("Character entered: " + ch);
        System.out.println("ASCII value: " + ascii);

        sc.close();
    }
}

