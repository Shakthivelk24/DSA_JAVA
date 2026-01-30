import java.util.ArrayDeque;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> q = new ArrayDeque<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            q.add(sc.nextInt()); // adds to the end of the queue
        }

        System.out.println("Queue: " + q); // print the queue
        System.out.println("Queue Front: " + q.peek()); // peek front element

        int removed = q.poll(); // removes the front element
        System.out.println("Removed: " + removed);

        System.out.println("After poll: " + q); // print queue after removal
        sc.close();
    }
}

// Output Example:
// How many values? 4
// Enter value 1: 8
// Enter value 2: 7
// Enter value 3: 10
// Enter value 4: 18
// Queue: [8, 7, 10, 18]
// Queue Front: 8
// Removed: 8
// After poll: [7, 10, 18]