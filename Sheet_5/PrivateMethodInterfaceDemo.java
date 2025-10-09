// File: PrivateMethodInterfaceDemo.java
interface MyInterface2 {
    private void privateHelper() { System.out.println("Private helper"); }
    default void callHelper() { privateHelper(); }
}

class MyClass2 implements MyInterface2 {}

public class PrivateMethodInterfaceDemo {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();
        obj.callHelper(); // private method called indirectly
    }
}
