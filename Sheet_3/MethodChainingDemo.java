class Car {
    String brand;
    String color;
    int speed;

    // Method to set brand
    Car setBrand(String brand) {
        this.brand = brand;
        return this;  // returns current object
    }

    // Method to set color
    Car setColor(String color) {
        this.color = color;
        return this;  // returns current object
    }

    // Method to set speed
    Car setSpeed(int speed) {
        this.speed = speed;
        return this;  // returns current object
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Car Brand : " + brand);
        System.out.println("Color     : " + color);
        System.out.println("Speed     : " + speed + " km/h");
    }
}

public class MethodChainingDemo {
    public static void main(String[] args) {
        // Create Car object and use method chaining
        Car car1 = new Car();

        car1.setBrand("Tesla")
            .setColor("Red")
            .setSpeed(150)
            .displayDetails(); // Chaining all methods in one line
    }
}
