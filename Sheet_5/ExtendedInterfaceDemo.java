// File: ExtendedInterfaceDemo.java
interface A1 { void methodA(); }
interface B1 extends A1 { void methodB(); }

class MyClass1 implements B1 {
    public void methodA() { System.out.println("Method A"); }
    public void methodB() { System.out.println("Method B"); }
}

public class ExtendedInterfaceDemo {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.methodA();
        obj.methodB();
    }
}
