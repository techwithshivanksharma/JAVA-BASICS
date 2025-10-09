package LabSheet6;

// Custom exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class code06 {
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18) throw new InvalidAgeException("Age must be >= 18");
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
