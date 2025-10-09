// File: StaticDefaultInterfaceDemo.java
interface MyInterface {
    static void staticMethod() { System.out.println("Static method"); }
    default void defaultMethod() { System.out.println("Default method"); }
}

class MyClass implements MyInterface {}

public class StaticDefaultInterfaceDemo {
    public static void main(String[] args) {
        MyInterface.staticMethod();
        MyClass obj = new MyClass();
        obj.defaultMethod();
    }
}
