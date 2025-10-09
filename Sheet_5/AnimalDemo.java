// File: AnimalDemo.java
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog(); // polymorphism
        a.makeSound();
        d.makeSound();
    }
}
