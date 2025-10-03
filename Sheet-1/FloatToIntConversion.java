import java.util.Scanner;

public class FloatToIntConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double num = sc.nextDouble();

        int converted = (int) num;

        System.out.print("Original Numner :" + num +"\n");
        System.out.print("Converted Number: " + converted);

        sc.close();
    }
}
