package DSA_JAVA.Java.collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPro {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(101, "Arun");
        map.put(102, "Bala");
        map.put(103, "Charan");

        System.out.println("Map: " + map);

        map.remove(102);

        System.out.println("After remove: " + map);

        System.out.println("Get 103: " + map.get(103));

        // Loop
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
// Output:
// Map: {101=Arun, 102=Bala, 103=Charan}
// After remove: {101=Arun, 103=Charan}
// Get 103: Charan
// 101 -> Arun
// 103 -> Charan