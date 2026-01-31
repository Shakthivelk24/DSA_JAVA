import java.util.LinkedList;
import java.util.Stack;

public class LinkedListPro {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        // Insert
        list.add(1, 15);
        // Adding at the beginning and end
        list.addFirst(5);
        list.addLast(40);

        System.out.println("List: " + list);
        // Get
        System.out.println("First: " + list.get(0));
        // Update
        list.set(2, 25);
        // Remove
        list.remove(Integer.valueOf(10));

        // Removing from the beginning and end
        list.removeFirst();
        list.removeLast();

        // Size
        System.out.println("Size: " + list.size());
        // Search
        System.out.println("Has 30? " + list.contains(30));

        System.out.println("After changes: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        // Queue use
        list.peek(); // see first
        list.poll(); // remove first

        // Stack use
        list.push(100); // add first
        list.pop(); // remove first

        // Loop
        for (int x : list) {
            System.out.println(x);
        }
    }
}
// Output:
// List: [5, 10, 15, 20, 30, 40]
// First: 5
// Size: 3
// Has 30? true
// After changes: [25, 20, 30]
// First: 25
// Last: 30
// 20
// 30