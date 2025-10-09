package LabSheet6;

public class code10 {
    static void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled in caller");
        }
    }
}
