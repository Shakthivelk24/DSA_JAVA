package AdvancedJava.Autoboxing;

/* Autoboxing with Collections (Most Common Use) */
import java.util.ArrayList;

public class AutoBox3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5); // Autoboxing
        list.add(10);
        list.add(15);

        System.out.println(list);
    }
}
// Output
// [5, 10, 15]