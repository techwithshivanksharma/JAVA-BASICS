// File: StaticNonStaticDemo.java
public class StaticNonStaticDemo {
    static void staticMethod() {
        System.out.println("Static method called");
    }

    void nonStaticMethod() {
        System.out.println("Non-static method called");
    }

    public static void main(String[] args) {
        staticMethod();

        StaticNonStaticDemo obj = new StaticNonStaticDemo();
        obj.nonStaticMethod();
    }
}
