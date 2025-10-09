// File: StaticVariableDemo.java
public class StaticVariableDemo {
    private static int count = 0;

    public static void increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        increment();
        increment();
        System.out.println("Count: " + getCount());
    }
}
