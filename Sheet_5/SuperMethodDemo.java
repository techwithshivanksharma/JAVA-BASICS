
class ParentClass2 {
    void display() {
        System.out.println("Parent display");
    }
}

class ChildClass2 extends ParentClass2 {
    void display() {
        System.out.println("Child display");
    }

    void showParent() {
        super.display();
    }
}

public class SuperMethodDemo {
    public static void main(String[] args) {
        ChildClass2 obj = new ChildClass2();
        obj.display();
        obj.showParent();
    }
}
