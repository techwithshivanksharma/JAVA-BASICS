class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Display student details
    void displayDetails() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
    }
}

public class StudentDemo2 {

    // Method that updates marks and returns the updated Student object
    static Student updateMarks(Student s, double newMarks) {
        s.marks = newMarks;
        return s;
    }

    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("Alice", 101, 85);

        // Display initial details
        System.out.println("Before updating marks:");
        s1.displayDetails();

        // Update marks by returning the object from the method
        Student updatedStudent = updateMarks(s1, 95);

        // Display details after update
        System.out.println("\nAfter updating marks:");
        updatedStudent.displayDetails();
    }
}
