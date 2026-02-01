import java.util.LinkedList;

public class LinkedListPro {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        // Adding elements at first and last
        list.addFirst(5);
        list.addLast(40);

        System.out.println("List: " + list);
        // removing first and last elements
        list.removeFirst();
        list.removeLast();

        list.set(1, 25);

        System.out.println("After changes: " + list);

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}
// Output:
// List: [5, 10, 20, 30, 40]
// After changes: [10, 25, 30]
// First: 10
// Last: 30