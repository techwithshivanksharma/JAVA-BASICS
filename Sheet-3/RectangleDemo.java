import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    // Constructor to initialize rectangle
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Method to calculate area
    double area() {
        return width * height;
    }

    // Method to calculate perimeter
    double perimeter() {
        return 2 * (width + height);
    }

    // Method to display rectangle details
    void displayDetails() {
        System.out.println("Width     : " + width);
        System.out.println("Height    : " + height);
        System.out.println("Area      : " + area());
        System.out.println("Perimeter : " + perimeter());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        System.out.print("Enter height of rectangle: ");
        double h = sc.nextDouble();

        // Create rectangle object
        Rectangle rect = new Rectangle(w, h);

        // Display details
        rect.displayDetails();

        sc.close();
    }
}
