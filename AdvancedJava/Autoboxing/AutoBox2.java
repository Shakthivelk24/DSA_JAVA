package AdvancedJava.Autoboxing;

/* Autoboxing with Method Parameters */

public class AutoBox2 {
    static void display(Integer x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        int value = 25;
        display(value);   // Autoboxing happens here - Primitive int passed where Integer is expected.
    }
}
// Output
// 25
