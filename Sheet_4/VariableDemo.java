// File: VariableDemo.java
public class VariableDemo {
    static int staticVar = 0;
    int instanceVar = 0;

    public void increment() {
        staticVar++;
        instanceVar++;
    }

    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        VariableDemo obj2 = new VariableDemo();

        obj1.increment();
        obj2.increment();

        System.out.println("Static Var: " + VariableDemo.staticVar); 
        System.out.println("Obj1 Instance Var: " + obj1.instanceVar); 
        System.out.println("Obj2 Instance Var: " + obj2.instanceVar);
    }
}
