package AdvancedJava.collections.Iterator;

/*
Write a program that uses Iterator to traverse 
and display an ArrayList of six names.
*/
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {

        // Creating ArrayList of names
        ArrayList<String> names = new ArrayList<>();

        // Adding six names
        names.add("Ananya");
        names.add("Rahul");
        names.add("Kiran");
        names.add("Sneha");
        names.add("Vikram");
        names.add("Pooja");

        // Creating Iterator
        Iterator<String> itr = names.iterator();

        // Traversing using Iterator
        System.out.println("Student Names:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
