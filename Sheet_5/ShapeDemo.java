// File: ShapeDemo.java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle"); }
}

class Rectangle extends Shape {
    void draw() { System.out.println("Drawing Rectangle"); }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape r = new Rectangle();
        c.draw();
        r.draw();
    }
}
