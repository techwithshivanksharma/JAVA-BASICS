package LabSheet6;

// Vehicles example with access modifiers
public class code01 {
    public String brand = "Toyota";
    private int speed = 120;
    protected String color = "Red";
    int year = 2020; // package-private

    public void drive() {
        System.out.println("Car is driving");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void packagePrivateMethod() {
        System.out.println("Package-private method");
    }

    public static void main(String[] args) {
        code01 car = new code01();
        car.drive();
        System.out.println(car.brand);
        System.out.println(car.color);
        System.out.println(car.year);
        car.packagePrivateMethod();
        car.protectedMethod();
    }
}
