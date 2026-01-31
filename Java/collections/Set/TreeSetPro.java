import java.util.TreeSet;

public class TreeSetPro {
   public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println("Set: " + set);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        set.pollFirst();
        set.pollLast();

        System.out.println("After poll: " + set);

        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 20: " + set.lower(20));
   } 
}
// Output:
// Set: [10, 20, 30, 40]
// First: 10
// Last: 40
// After poll: [20, 30]
// Higher than 20: 30
// Lower than 20: null
