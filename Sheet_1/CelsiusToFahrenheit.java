import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (double)((celsius * 9.0 / 5.0) + 32);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
