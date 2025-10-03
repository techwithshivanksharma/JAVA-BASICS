import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;
        double percentage = (total * 100)/ 300;  

        System.out.println("Total marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (sub1 >= 40 && sub2 >= 40 && sub3 >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        sc.close();
    }
}
