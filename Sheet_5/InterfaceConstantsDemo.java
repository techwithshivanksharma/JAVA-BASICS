// File: InterfaceConstantsDemo.java
interface Constants {
    int VALUE = 100; // implicitly public static final
}

public class InterfaceConstantsDemo {
    public static void main(String[] args) {
        System.out.println("Constant: " + Constants.VALUE);
    }
}
