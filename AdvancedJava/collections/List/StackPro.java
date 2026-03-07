import java.util.Stack;

public class StackPro {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        // Push
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);

        // Peek
        System.out.println("Top: " + s.peek());

        // Pop
        int removed = s.pop();
        System.out.println("Removed: " + removed);

        // After pop
        System.out.println("Stack now: " + s);

        // Search
        System.out.println("Position of 10: " + s.search(10));

        // Empty check
        System.out.println("Is empty? " + s.empty());
    }
}

// Output:
// Stack: [10, 20, 30]
// Top: 30
// Removed: 30
// Stack now: [10, 20]
// Position of 10: 2
// Is empty? false