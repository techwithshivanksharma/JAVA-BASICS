package LabSheet6;

public class code07 {
    public static void main(String[] args) {
        try {
            try {
                int a = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: divide by zero");
            }

            int[] arr = {1};
            System.out.println(arr[5]); // Will cause outer catch
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: array index error");
        }
    }
}
