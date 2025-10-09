// File: DefaultAccessDemo.java
class DefaultClass {
    String message = "Default access within same package";
}

public class DefaultAccessDemo {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        System.out.println(obj.message);
    }
}
