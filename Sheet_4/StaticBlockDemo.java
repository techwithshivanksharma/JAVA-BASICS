// File: StaticBlockDemo.java
public class StaticBlockDemo {
    static int data;

    static {
        data = 100;
        System.out.println("Static block executed, data initialized to " + data);
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
