import java.util.Vector;

public class VectorPro {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        // Add
        v.add(10);
        v.add(20);
        
        System.out.println("Vector is "+v);

        // Get
        System.out.println("Get element at index 0: " + v.get(0));

        v.set(1, 50);

        v.remove(0);
        v.removeElement(20);

        System.out.println("Size: " + v.size());
        
        
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Contains 50: " + v.contains(50));

        System.out.println("Vector: " + v);

        for (int x : v) {
            System.out.println(x);
        }
        v.clear();
    }
}
// // Output:
// Vector is [10, 20]
// Get element at index 0: 10
// Size: 1
// Capacity: 10
// Contains 50: true
// Vector: [50]
// 50
