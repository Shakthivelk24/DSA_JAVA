package AdvancedJava.Autoboxing;

/* Autoboxing in Expressions */
class AutoBox5 {
    public static void main(String[] args) {
        Integer a = 10;   // Autoboxing
        Integer b = 20;   // Autoboxing

        Integer sum = a + b;   // Unboxing + Addition + Autoboxing

        System.out.println("Sum = " + sum);
    }
}
// Output
// Sum = 30
