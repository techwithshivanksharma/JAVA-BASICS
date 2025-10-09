// File: FinalVariableDemo.java
public class FinalVariableDemo {
    final int number = 10;

    public void modify() {
        // number = 20; // Error: cannot assign a value to final variable
    }

    public static void main(String[] args) {
        FinalVariableDemo obj = new FinalVariableDemo();
        System.out.println("Final variable: " + obj.number);
    }
}
