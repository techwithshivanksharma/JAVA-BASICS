// File: ProtectedDemo.java
class Parent {
    protected String message = "Hello from Parent";
}

class Child extends Parent {
    public void showMessage() {
        System.out.println(message);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.showMessage();
    }
}
