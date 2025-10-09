package LabSheet6;

public class code08 {
    public static void main(String[] args) {
        int age = -5;
        if(age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}

