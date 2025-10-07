class Student {
    // Private attributes (cannot be accessed directly from outside)
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    // Setter for rollNumber
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) { // Validating marks
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        }
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("Alice", 101, 85.5);

        // Display initial details
        System.out.println("Initial Student Details:");
        s1.displayDetails();

        // Update values using setters
        s1.setName("Alice Johnson");
        s1.setMarks(92.0);

        // Display updated details
        System.out.println("\nUpdated Student Details:");
        s1.displayDetails();
    }
}
