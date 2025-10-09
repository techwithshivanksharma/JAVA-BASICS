package LabSheet6;

public class code11 {
    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Logging exception");
                throw e; // rethrow
            }
        } catch (ArithmeticException e) {
            System.out.println("Handled rethrown exception");
        }
    }
}

