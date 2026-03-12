/*
Sorting numbers in descending order using Comparator
*/
import java.util.*;

class MyComparator implements Comparator<Integer> {

    public int compare(Integer a, Integer b) {
        return b - a;
    }
}

class ComparatorExample {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<Integer>(new MyComparator());

        set.add(10);
        set.add(5);
        set.add(20);

        System.out.println(set);
    }
}
/*
Observation:
Default sorting - Ascending order
Using Comparator - Custom sorting (Descending order)
*/
// Output: [20, 10, 5]
