// File: FinalMethodDemo.java
class Base {
    final void display() { System.out.println("Final method in Base"); }
}

class Derived extends Base {
    // void display() {} // Error: cannot override final method
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Base b = new Base();
        b.display();
    }
}
