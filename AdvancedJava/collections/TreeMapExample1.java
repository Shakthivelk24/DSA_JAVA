/*
A teacher wants to maintain the tm of a 
student in different subjects using a Java collection. 
Since the teacher wants the subjects to be 
automatically arranged in alphabetical order, 
a TreeMap is used.

Write a Java program to store the following subject tm in a TreeMap:

Subject	   tm
 Maths	    85
 Physics    90
 Chemistry	88

Perform the following operations:
1. Insert the subject–mark pairs into the TreeMap.
2. Display all the subjects stored in the TreeMap.
3. Display all the tm.
4. Display each subject along with its corresponding mark.


*/
import java.util.*;

class TreeMapExample1 {
    public static void main(String[] args) {

        // Creating TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();

        // Adding elements
        tm.put("Maths", 85);
        tm.put("Physics", 90);
        tm.put("Chemistry", 88);

        // Display all keys
        System.out.println("Subjects: " + tm.keySet());

        // Display all values
        System.out.println("tm: " + tm.values());

        // Display key-value pairs
        for(String obj : tm.keySet()) {
            System.out.println(obj + " : " + tm.get(obj));
			//Note: Observe how the subjects are automatically sorted in alphabetical order when displayed.
		}
    }
}

//Output:
// Subjects: [Chemistry, Maths, Physics]
// tm: [88, 85, 90]
// Chemistry : 88
// Maths : 85
// Physics : 90