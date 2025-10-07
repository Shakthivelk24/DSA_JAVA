public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.eat(); // Dog's eat()
        cat.eat(); // Cat's eat()

        // polymorphism and instanceof check
        Animal a = new Dog("Max");
        a.sleep();
        if (a instanceof Dog) {
            ((Dog) a).bark();
        }

        // upcasting and downcasting
        Dog d = new Dog("Rex");
        Animal up = d;           // upcast
        Dog down = (Dog) up;     // downcast
        down.bark();
    }
}

class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public void eat() { System.out.println(name + " is eating (Animal)."); }
    public void sleep() { System.out.println(name + " is sleeping."); }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override
    public void eat() { System.out.println(name + " is eating dog food."); }
    public void bark() { System.out.println(name + " says: Woof!"); }
}

class Cat extends Animal {
    public Cat(String name) { super(name); }
    @Override
    public void eat() { System.out.println(name + " is eating cat food."); }
    public void meow() { System.out.println(name + " says: Meow!"); }
}
