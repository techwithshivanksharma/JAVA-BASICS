// File: MathUtilsDemo.java
public class MathUtilsDemo {
    static class MathUtils {
        public static int add(int a, int b) { return a + b; }
        public static int subtract(int a, int b) { return a - b; }
        public static int multiply(int a, int b) { return a * b; }
    }

    public static void main(String[] args) {
        System.out.println("Add: " + MathUtils.add(5, 3));
        System.out.println("Subtract: " + MathUtils.subtract(5, 3));
        System.out.println("Multiply: " + MathUtils.multiply(5, 3));
    }
}
