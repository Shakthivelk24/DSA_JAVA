import java.util.ArrayDeque; //Stack implementation using ArrayDeque
import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>(); // Using ArrayDeque as Stack

        System.out.print("How many values? ");
        int n = sc.nextInt();

        // Taking input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int x = sc.nextInt();
            stack.push(x);
        }

        System.out.println("Stack Top: " + stack.peek());
        // Print stack
        System.out.println("Stack: " + stack);

        // Pop one element
        int removed = stack.pop();
        System.out.println("Removed: " + removed);

        // Print after pop
        System.out.println("After pop: " + stack);
        sc.close();
    }
}
// Output Example:
// How many values? 4
// Enter value 1: 7
// Enter value 2: 8
// Enter value 3: 10
// Enter value 4: 18
// Stack Top: 18
// Stack: [18, 10, 8, 7]
// Removed: 18
// After pop: [10, 8, 7]
