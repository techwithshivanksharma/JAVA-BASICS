// File: AccessModifierDemo.java
class Parent {
    private String privateMsg = "Private";
    protected String protectedMsg = "Protected";
    public String publicMsg = "Public";

    void showMessages() {
        System.out.println(privateMsg + ", " + protectedMsg + ", " + publicMsg);
    }
}

class Child extends Parent {
    void showChildMessages() {
        // System.out.println(privateMsg); // Error: private not accessible
        System.out.println(protectedMsg); // accessible
        System.out.println(publicMsg); // accessible
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.showChildMessages();
    }
}
