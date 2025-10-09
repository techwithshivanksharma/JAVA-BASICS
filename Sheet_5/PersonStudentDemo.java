// File: PersonStudentDemo.java
class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int rollNo;
    public Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class PersonStudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Alice", 101);
        s.display();
    }
}
