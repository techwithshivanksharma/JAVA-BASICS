import java.util.Scanner;

class Employee {
    String name;
    int id;
    String department;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Name      : " + name);
        System.out.println("Employee ID        : " + id);
        System.out.println("Department         : " + department);
        System.out.println("Salary             : $" + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Create Employee object
        Employee emp = new Employee(name, id, department, salary);

        // Display employee details
        System.out.println("\nEmployee Details:");
        emp.displayDetails();

        sc.close();
    }
}
