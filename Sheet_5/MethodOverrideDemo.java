// File: MethodOverrideDemo.java
class ParentClass {
    void show() { System.out.println("Parent method"); }
}

class ChildClass extends ParentClass {
    @Override
    void show() { System.out.println("Child method"); }
}

public class MethodOverrideDemo {
    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        ParentClass obj2 = new ChildClass();

        obj1.show();
        obj2.show(); // polymorphic call
    }
}
