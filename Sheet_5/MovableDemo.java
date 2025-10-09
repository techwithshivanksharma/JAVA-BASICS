// File: MovableDemo.java
interface Movable {
    void moveUp();
    void moveDown();
}

class Robot implements Movable {
    public void moveUp() { System.out.println("Robot moves up"); }
    public void moveDown() { System.out.println("Robot moves down"); }
}

public class MovableDemo {
    public static void main(String[] args) {
        Robot r = new Robot();
        r.moveUp();
        r.moveDown();
    }
}
