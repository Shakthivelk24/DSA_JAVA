package AdvancedJava.Autoboxing;
/* Autoboxing with Different Primitive Types */
public class AutoBox4 {
    public static void main(String[] args) {
        double d = 5.5;
        Double dObj = d;   // double → Double

        char ch = 'A';
        Character chObj = ch;  // char → Character

        boolean flag = true;
        Boolean bObj = flag;   // boolean → Boolean

        System.out.println(dObj);
        System.out.println(chObj);
        System.out.println(bObj);
    }
}

// Output
// 5.5
// A
// true