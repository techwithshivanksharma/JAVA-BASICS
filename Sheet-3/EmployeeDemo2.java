class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary       : $" + salary);
    }
}

public class EmployeeDemo2{

    // Method to update salary of Employee object
    static void updateSalary(Employee emp, double newSalary) {
        emp.salary = newSalary;
        System.out.println(emp.name + "'s salary updated to $" + emp.salary);
    }

    public static void main(String[] args) {
        // Create Employee object
        Employee e1 = new Employee("John", 50000);

        // Display initial details
        System.out.println("Before salary update:");
        e1.displayDetails();

        // Update salary by passing object to method
        updateSalary(e1, 60000);

        // Display details after update
        System.out.println("\nAfter salary update:");
        e1.displayDetails();
    }
}
