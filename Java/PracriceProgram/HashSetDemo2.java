import java.util.HashSet;

class HashSetDemo2 {
    public static void main(String[] args) {
        // Creating HashSet
        HashSet<Integer> hs = new HashSet<>();
        // 1. Adding roll numbers
        hs.add(101);
        hs.add(102);
        hs.add(103);
        hs.add(104);
        hs.add(105);
        // 2. Attempt to add duplicate roll number
        boolean result = hs.add(103);
        if (!result)
            System.out.println("Duplicate roll number not added.");
        // 3. Display roll numbers
        System.out.println("\nRoll Numbers in Set:");
        System.out.println(hs);
        // 4. Total unique roll numbers
        System.out.println("\nTotal Unique Roll Numbers: "
                + hs.size());
        // 5. Checking roll number existence
        int searchRoll = 102;
        if (hs.contains(searchRoll))
            System.out.println("Roll number "
                    + searchRoll + " exists.");
        else
            System.out.println("Roll number not found.");
    }
}
// Output:
// Duplicate roll number not added.

// Roll Numbers in Set:
// [101, 102, 103, 104, 105]

// Total Unique Roll Numbers: 5
// Roll number 102 exists.