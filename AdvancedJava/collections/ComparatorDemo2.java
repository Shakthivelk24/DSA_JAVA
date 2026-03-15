/*
Write a Java program that creates a list of 
five Student objects with fields name and marks. 
Sort the list: 
(a) by marks in ascending order using a Comparator, 
(b) by name alphabetically using a second Comparator. 
Display the sorted list for both cases.
*/
import java.util.*;

// Student class
class Student {
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    public String toString() {
        return name + " - " + marks;
    }
}

// Comparator for sorting by marks
class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.marks - s2.marks; // ascending order
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

class ComparatorDemo2 {
    public static void main(String[] args) {

        // Creating list of students
        List<Student> al = new ArrayList<>();

        al.add(new Student("Ravi", 85));
        al.add(new Student("Anita", 92));
        al.add(new Student("Kiran", 78));
        al.add(new Student("Meena", 88));
        al.add(new Student("Arun", 80));

        // Sorting by marks
        Collections.sort(al, new MarksComparator());

        System.out.println("Sorted by Marks:");
        for(Student obj : al) {
            System.out.println(obj);
        }

        // Sorting by name
        Collections.sort(al, new NameComparator());

        System.out.println("\nSorted by Name:");
        for(Student obj : al) {
            System.out.println(obj);
        }
    }
}

// Output:
// Sorted by Marks:
// Kiran - 78
// Arun - 80
// Ravi - 85
// Meena - 88
// Anita - 92

// Sorted by Name:
// Anita - 92
// Arun - 80
// Kiran - 78
// Meena - 88
// Ravi - 85


	

