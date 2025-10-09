package LabSheet6;

public class code05 {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
            String s = null;
            System.out.println(s.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (NullPointerException e) {
            System.out.println("Null pointer error");
        }
    }
}
