class Vehicle {
    String name;
    int speed;
    String color;

    // Parameterized constructor
    Vehicle(String name, int speed, String color) {
        this.name = name;
        this.speed = speed;
        this.color = color;
    }

    // Method to start engine
    void startEngine() {
        System.out.println(name + "'s engine started.");
    }

    // Overloaded setSpeed methods

    // 1. Set speed only
    void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(name + "'s speed updated to " + speed + " km/h");
    }

    // 2. Set speed and color
    void setSpeed(int speed, String color) {
        this.speed = speed;
        this.color = color;
        System.out.println(name + "'s speed updated to " + speed + " km/h and color updated to " + color);
    }

    // Display vehicle details
    void displayDetails() {
        System.out.println("Vehicle Name : " + name);
        System.out.println("Speed        : " + speed + " km/h");
        System.out.println("Color        : " + color);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle car = new Vehicle("Car", 120, "Red");
        Vehicle bike = new Vehicle("Bike", 80, "Blue");

        // Start engines
        car.startEngine();
        bike.startEngine();

        // Update speed only
        car.setSpeed(150);

        // Update speed and color
        bike.setSpeed(100, "Green");

        // Display details
        System.out.println("\nVehicle Details:");
        car.displayDetails();
        System.out.println();
        bike.displayDetails();
    }
}
