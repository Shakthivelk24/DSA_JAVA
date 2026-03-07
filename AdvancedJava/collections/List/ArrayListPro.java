import java.util.ArrayList;

public class ArrayListPro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        // Insert
        list.add(1, 15);

        System.out.println("List: " + list);

        // Get
        System.out.println("First: " + list.get(0));

        // Update
        list.set(2, 25);

        // Remove
        list.remove(Integer.valueOf(10));

        // Size
        System.out.println("Size: " + list.size());

        // Search
        System.out.println("Has 30? " + list.contains(30));

        // Loop
        for (int x : list) {
            System.out.println(x);
        }
    }
}
//Output:
// List: [10, 15, 20, 30]
// First: 10
// Size: 3
// Has 30? true
// 15
// 25
// 30