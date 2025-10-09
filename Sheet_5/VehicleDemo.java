// File: VehicleDemo.java
class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
}

class Car extends Vehicle {
    void drive() { System.out.println("Car drives"); }
}

class ElectricCar extends Car {
    void charge() { System.out.println("ElectricCar charging"); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();
        ec.drive();
        ec.charge();
    }
}
