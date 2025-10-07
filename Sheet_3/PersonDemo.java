import java.util.Scanner;

class Person {

    // Method to display full name
    void displayFullName(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person = new Person();

        // Input first and last name
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        // Display full name
        person.displayFullName(firstName, lastName);

        sc.close();
    }
}
