// File: FinalClassDemo.java
final class FinalClass {}

class Child extends FinalClass { 
    // Error: cannot inherit from final class
}

public class FinalClassDemo {
    public static void main(String[] args) {}
}
