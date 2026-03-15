/*
Write a Java program that stores five product 
names in an ArrayList. 
Traverse and display the list using: 
(a) for-each loop, 
(b) Iterator, 
(c) ListIterator in forward direction, 
(d) ListIterator in backward direction.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ForEachIteratorListIteratorDemo {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> products = new ArrayList<>();

        // Adding product names
        products.add("Laptop");
        products.add("Mobile");
        products.add("Keyboard");
        products.add("Mouse");
        products.add("Printer");

        // (a) Traversal using For-Each Loop
        System.out.println("Using For-Each Loop:");
        for (String product : products) {
            System.out.println(product);
        }

        // (b) Traversal using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> itr = products.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // (c) ListIterator - Forward Direction
        System.out.println("\nUsing ListIterator (Forward):");
        ListIterator<String> listItr = products.listIterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        // (d) ListIterator - Backward Direction
        System.out.println("\nUsing ListIterator (Backward):");
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }
    }
}
// Output:
// Using For-Each Loop:
// Laptop
// Mobile
// Keyboard
// Mouse
// Printer

// Using Iterator:
// Laptop
// Mobile
// Keyboard
// Mouse
// Printer

// Using ListIterator (Forward):
// Laptop
// Mobile
// Keyboard
// Mouse
// Printer

// Using ListIterator (Backward):
// Printer
// Mouse
// Keyboard
// Mobile
// Laptop