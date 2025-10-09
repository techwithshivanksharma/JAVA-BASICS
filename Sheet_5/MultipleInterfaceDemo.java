// File: MultipleInterfaceDemo.java
interface X { void methodX(); }
interface Y { void methodY(); }

class MyClass3 implements X, Y {
    public void methodX() { System.out.println("Method X"); }
    public void methodY() { System.out.println("Method Y"); }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        MyClass3 obj = new MyClass3();
        obj.methodX();
        obj.methodY();
    }
}
