// File: MultipleInheritanceDemo.java
interface A2 { void methodA(); }
interface B2 { void methodB(); }

class MultiClass implements A2, B2 {
    public void methodA() { System.out.println("Method A"); }
    public void methodB() { System.out.println("Method B"); }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        MultiClass obj = new MultiClass();
        obj.methodA();
        obj.methodB();
    }
}
