/*
Write a program that sorts a list of five names by 
their length (shortest first) using a Comparator.
*/
import java.util.*;

// Comparator to compare length of names
class LengthComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        return s1.length() - s2.length(); // shortest first
    }
}

class ComparatorDemo1 {
    public static void main(String[] args) {

        // Creating list of names
        List<String> al = new ArrayList<>();

        al.add("Ravi");
        al.add("Anita");
        al.add("Kiran");
        al.add("Meena");
        al.add("Arun");

        // Sorting using comparator
        Collections.sort(al, new LengthComparator());

        // Display sorted names
        System.out.println("Names sorted by length:");
        for(String obj : al) {
            System.out.println(obj);
        }
    }
}
// Output:
// Names sorted by length:
// Ravi
// Arun
// Kiran
// Meena