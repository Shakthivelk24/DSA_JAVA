import java.util.HashSet;

public class HashSetPro {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

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
// Set: [20, 10, 30]
// Has 30? true
// Size: 2
// 10
// 30
