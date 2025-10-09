package LabSheet6;

class Truck {
    int capacity = 5000; // package-private
    void load() {
        System.out.println("Truck is loading");
    }
}

public class code17 {
    public static void main(String[] args) {
        Truck t = new Truck();
        System.out.println("Truck capacity: " + t.capacity);
        t.load();
    }
}
