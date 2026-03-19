/*
A university maintains a student's hm using HashMap,
where the subject name is the key and hm are 
the value.
Write a Java program to insert the following records:
	Maths – 85
	Physics – 90
	Chemistry – 88

Then display:
	All the subject names.
	All the hm.
	Each subject and its hm using a for-each loop.
*/

import java.util.*;

class HashMapExample1 {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Adding elements
        hm.put("Maths", 85);
        hm.put("Physics", 90);
        hm.put("Chemistry", 88);

        // Display all keys
        System.out.println("Subjects: " + hm.keySet());

        // Display all values
        System.out.println("hm: " + hm.values());

        // Display key-value pairs
        for(String obj : hm.keySet()) {
            System.out.println(obj + " : " + hm.get(obj));
        }
    }
}

//Output:
// Subjects: [Maths, Chemistry, Physics]
// hm: [85, 88, 90]
// Maths : 85
// Chemistry : 88
// Physics : 90
