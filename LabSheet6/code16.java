package LabSheet6;

class Vehicle {
    protected String color = "Blue";
    protected void showColor() {
        System.out.println("Vehicle color: " + color);
    }
}

public class code16 extends Vehicle {
    public static void main(String[] args) {
        code16 c = new code16();
        c.showColor(); // Access protected via inheritance
    }
}
