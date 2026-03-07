import java.util.LinkedHashSet;

public class LinkedHashSetPro {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // duplicate

        System.out.println("Set: " + set);

        // Remove
        set.remove(20);

        // Search
        System.out.println("Has 30? " + set.contains(30));

        // Size
        System.out.println("Size: " + set.size());

        // Loop
        for (int x : set) {
            System.out.println(x);
        }
    }
}
// Output:
// Set: [10, 20, 30]
// Has 30? true
// Size: 2
// 10
// 30
