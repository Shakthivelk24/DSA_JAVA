package Iterator;

/*
Compare Iterator and for-each loop in Java. 
State two advantages and one limitation of each. 
Write a program that traverses the same ArrayList 
using both methods and displays the elements.
*/
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorVsForEachDemo {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Anu");
        names.add("Ravi");
        names.add("Kiran");
        names.add("Meena");
        names.add("Sita");

        // Traversal using Iterator
        System.out.println("Traversal using Iterator:");
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Traversal using For-Each loop
        System.out.println("\nTraversal using For-Each Loop:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

// Output:
// Traversal using Iterator:
// Anu
// Ravi
// Kiran
// Meena
// Sita

// Traversal using For-Each Loop:
// Anu
// Ravi
// Kiran
// Meena
// Sita