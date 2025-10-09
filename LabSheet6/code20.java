package LabSheet6;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class code20 {
    public static void main(String[] args) {
        // Unchecked Exception (ArithmeticException)
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e);
        }

        // Checked Exception (FileNotFoundException)
        try {
            FileReader fr = new FileReader("nonexistent.txt"); // FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: " + e);
        }

        System.out.println("Program continues after handling both exceptions.");
    }
}
