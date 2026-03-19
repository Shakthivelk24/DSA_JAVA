/*
Write a program that creates a HashSet of String, 
adds five city names including two duplicates, 
and displays the result. 
Explain why duplicates are not stored.
*/
import java.util.HashSet;

class HashSetDemo1 {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<String> cities = new HashSet<>();

        // Adding city names (with duplicates)
        cities.add("Bangalore");
        cities.add("Mysore");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Delhi");     // Duplicate
        cities.add("Bangalore"); // Duplicate

        // Displaying HashSet
        System.out.println("Cities in HashSet:");
        System.out.println(cities);
    }
}

/*
HashSet does not store duplicates because 
it internally uses HashMap. 
When an element is added, 
Java checks the hashCode and equals methods. 
If an equal element already exists, 
the new element is not added.
*/

//Output:
// Cities in HashSet:
// [Delhi, Mumbai, Bangalore, Mysore]