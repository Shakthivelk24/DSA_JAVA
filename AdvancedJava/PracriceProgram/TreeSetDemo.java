package AdvancedJava.PracriceProgram;

import java.util.TreeSet;

class TreeSetDemo1 {
    public static void main(String[] args) {
        // 1. Creating TreeSet
        TreeSet<String> ts = new TreeSet<>();
        // Adding names in unsorted(random) order
        ts.add("Ravi");
        ts.add("Anita");
        ts.add("Kiran");
        ts.add("Sneha");
        ts.add("Vijay");
        ts.add("Meena");
        ts.add("Arjun");
        ts.add("Divya");
        ts.add("Pooja");
        ts.add("Rahul");
        // 2. Display names (Automatically sorted)
        System.out.println("Student Names in Alphabetical Order:");
        System.out.println(ts);
        // 3. Display first name
        System.out.println("\nFirst Student: "
                + ts.first());
        // 4. Display last name
        System.out.println("Last Student: "
                + ts.last());
    }
}

// Output:
// Student Names in Alphabetical Order:
// [Anita, Arjun, Divya, Kiran, Meena, Pooja, Rahul, Ravi, Sneha, Vijay]

// First Student: Anita
// Last Student: Vijay
