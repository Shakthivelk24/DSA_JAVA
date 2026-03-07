package DSA_JAVA.Java.collections.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashtablePro {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(101, "Arun");
        table.put(102, "Bala");
        table.put(103, "Charan");

        System.out.println("Table: " + table);

        System.out.println("Get 102: " + table.get(102));

        table.remove(101);

        System.out.println("After remove: " + table);

        // Loop
        for(Map.Entry<Integer, String> e : table.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
// Output
// Table: {103=Charan, 102=Bala, 101=Arun}
// Get 102: Bala
// After remove: {103=Charan, 102=Bala}
// 103 -> Charan
// 102 -> Bala