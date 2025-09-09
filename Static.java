public class Static {
    static int staticVariable = 42;
    int instanceVariable = 7;
    static void staticMethod() {
        System.out.println("Static method called. Static variable: " + staticVariable);
    }    
    void instanceMethod() {
        System.out.println("Instance method called. Instance variable: " + instanceVariable);
    }
    public static void main(String[] args) {
        // Accessing static method and variable without creating an instance
        Static.staticMethod();
        System.out.println("Accessing static variable directly: " + Static.staticVariable);

        // Creating an instance to access instance method and variable
        Static obj = new Static();
        obj.instanceMethod();
        System.out.println("Accessing instance variable through object: " + obj.instanceVariable);
    }
}
