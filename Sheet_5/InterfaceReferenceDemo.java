// File: InterfaceReferenceDemo.java
interface Printable {
    void print();
}

class Document implements Printable {
    public void print() { System.out.println("Printing document"); }
}

public class InterfaceReferenceDemo {
    public static void main(String[] args) {
        Printable p = new Document();
        p.print(); // interface reference
    }
}
