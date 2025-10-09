// File: LibraryDemo.java
public class LibraryDemo {
    class Member {
        String name;
        Member(String name) { this.name = name; }
        void display() { System.out.println("Member: " + name); }
    }

    public static void main(String[] args) {
        LibraryDemo library = new LibraryDemo();
        Member m1 = library.new Member("Alice");
        Member m2 = library.new Member("Bob");
        m1.display();
        m2.display();
    }
}
