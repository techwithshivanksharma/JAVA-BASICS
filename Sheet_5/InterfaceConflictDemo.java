// File: InterfaceConflictDemo.java
interface A { default void show() { System.out.println("A"); } }
interface B { default void show() { System.out.println("B"); } }

class C implements A, B {
    public void show() { A.super.show(); B.super.show(); } // resolve conflict
}

public class InterfaceConflictDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
