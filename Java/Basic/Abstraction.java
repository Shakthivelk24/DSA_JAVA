abstract class Vehicle {
    abstract void start();  // abstract method (no body)

    void stop() {           // normal method
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

interface Animal {
    void sound();  // abstract method by default
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Car();  // Upcasting
        v.start();              // Calls Car’s implementation
        v.stop(); 
        Animal a = new Dog();
        a.sound();              // Calls Vehicle’s method
    }
}