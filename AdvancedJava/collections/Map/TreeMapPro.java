package DSA_JAVA.Java.collections.Map;

import java.util.TreeMap;

public class TreeMapPro {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(40, "D");
        map.put(10, "A");
        map.put(30, "C");
        map.put(20, "B");

        System.out.println("Map: " + map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        map.pollFirstEntry();

        System.out.println("After poll: " + map);

        System.out.println("Higher than 20: " + map.higherKey(20));
        System.out.println("Lower than 20: " + map.lowerKey(20));
    }
}
// Output:
// Map: {10=A, 20=B, 30=C, 40=D}
// First Key: 10
// Last Key: 40
// After poll: {20=B, 30=C, 40=D}
// Higher than 20: 30
// Lower than 20: null
