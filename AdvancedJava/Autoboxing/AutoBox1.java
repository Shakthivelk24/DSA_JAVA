package AdvancedJava.Autoboxing;
// Autoboxing Example - Automatic conversion of primitive to wrapper class
public class AutoBox1 {
    public static void main(String[] args) {
        int num = 10;
        Integer obj = num;   // Autoboxing - int → automatically converted to Integer

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper Object: " + obj);
    }
}
// Output
// Primitive: 10
// Wrapper Object: 10
