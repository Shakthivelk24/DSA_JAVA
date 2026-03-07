package DSA_JAVA.Java.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPro {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Arun");
        map.put(102, "Bala");
        map.put(103, "Charan");

        System.out.println("Map: " + map);

        System.out.println("Get 102: " + map.get(102));

        map.remove(101);

        System.out.println("After remove: " + map);

        System.out.println("Has key 103? " + map.containsKey(103));

        System.out.println("Has value Bala? " + map.containsValue("Bala"));

        // Loop
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
// Output:
// Map: {101=Arun, 102=Bala, 103=Charan}
// Get 102: Bala
// After remove: {102=Bala, 103=Charan}
// Has key 103? true
// Has value Bala? true
// 102 -> Bala
// 103 -> Charan