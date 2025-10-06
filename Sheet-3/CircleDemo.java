import java.util.Scanner;

class Circle {
    double radius;

    // Constructor to initialize radius
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    double area() {
        return Math.PI * radius * radius;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle  : " + area());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius from user
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // Create Circle object
        Circle c = new Circle(r);

        // Display area
        c.displayDetails();

        sc.close();
    }
}
