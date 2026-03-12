package AdvancedJava.collections.Iterator;

/*
Write a program that uses Iterator to traverse 
and display an ArrayList of five integers.
*/
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding five integers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Creating Iterator
        Iterator<Integer> itr = numbers.iterator();

        // Traversing using Iterator
        System.out.println("Elements in ArrayList:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
// Output:
// Elements in ArrayList:
// 10
// 20
// 30
// 40
// 50
