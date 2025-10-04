import java.util.Scanner;

public class HeightClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        int height = sc.nextInt();

        if (height < 150) {
            System.out.println("Short");
        } else if (height <= 170) { // 150 to 170 inclusive
            System.out.println("Average");
        } else if (height > 170) {
            System.out.println("Tall");
        } else {
            System.out.println("Invalid height input!");
        }

        sc.close();
    }
}
