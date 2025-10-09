// File: NestedClassDemo.java
public class NestedClassDemo {
    static class Outer {
        static class Inner {
            void display() {
                System.out.println("Inside static nested class");
            }
        }
    }

    public static void main(String[] args) {
        NestedClassDemo.Outer.Inner obj = new NestedClassDemo.Outer.Inner();
        obj.display();
    }
}
