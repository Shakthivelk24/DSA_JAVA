import java.util.ArrayDeque;

public class ArrayDequePro {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // As Queue
        dq.add(10);
        dq.add(20);
        dq.add(30);

        System.out.println("Queue: " + dq);
        dq.poll();   // removes 10

        System.out.println("After poll: " + dq);

        // As Stack
        dq.push(100);
        dq.push(200);

        System.out.println("Stack: " + dq);

        dq.pop();   // removes 200

        System.out.println("After pop: " + dq);
    }
}
// Output:
// Queue: [10, 20, 30]
// After poll: [20, 30]
// Stack: [200, 100, 20, 30]
// After pop: [100, 20, 30]