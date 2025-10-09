package LabSheet6;

import java.io.*;

public class code13 {
    public static void main(String[] args) {
        // Unchecked exception
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked exception caught: " + e);
        }

        // Checked exception
        try {
            FileReader fr = new FileReader("test.txt"); // FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception caught: " + e);
        }
    }
}
