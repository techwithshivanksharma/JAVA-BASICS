// File: SuperclassReferenceDemo.java
class SuperClass {
    void display() { System.out.println("SuperClass method"); }
}

class SubClass extends SuperClass {
    @Override
    void display() { System.out.println("SubClass method"); }
}

public class SuperclassReferenceDemo {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.display(); // calls overridden method
    }
}
