import java.util.PriorityQueue;

public class PriorityQueuePro {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Queue: " + pq);

        System.out.println("Top: " + pq.peek());

        pq.poll();

        System.out.println("After poll: " + pq);
    }
}
// Output:
// Queue: [10, 20, 30, 40]
// Top: 10
// After poll: [20, 40, 30]