class MathOps {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        MathOps obj = new MathOps();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        Animal obj1 = new Dog(); // Upcasting
        obj1.sound(); // Runtime Polymorphism
    }
}
