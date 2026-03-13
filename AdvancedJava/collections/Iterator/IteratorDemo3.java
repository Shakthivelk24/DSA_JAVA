package Iterator;
/*
Write a Java program that uses Iterator to 
traverse an ArrayList of integers and removes 
all even numbers during traversal. 
Display the list before and after removal.
*/
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo3 {
    public static void main(String[] args) {

        // Creating ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);

        // Display list before removal
        System.out.println("List before removing even numbers:");
        System.out.println(numbers);

        // Creating Iterator
        Iterator<Integer> itr = numbers.iterator();

        // Removing even numbers using Iterator
        while (itr.hasNext()) {
            int num = itr.next();

            if (num % 2 == 0) {
                itr.remove();   // Safe removal during traversal
            }
        }

        // Display list after removal
        System.out.println("List after removing even numbers:");
        System.out.println(numbers);
    }
}
// Output:
// List before removing even numbers:
// [10, 15, 20, 25, 30, 35]
// List after removing even numbers:
// [15, 25, 35]
