/*
A teacher wants to analyze the performance of students 
in an internal assessment. 
The marks of five students are stored dynamically 
using an ArrayList instead of an array so that the 
data structure can be easily modified in the future.
Write a Java program using ArrayList to store 
the marks of five students. Using a for-each loop, 
find and display:
1.	The maximum mark
2.	The minimum mark
3.	The total marks obtained by the students
*/

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListDemo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating ArrayList
        ArrayList<Integer> al = new ArrayList<>();

        // Reading marks
        System.out.println("Enter marks of five students:");
        for(int i = 1; i <= 5; i++) {
			int marks = sc.nextInt();			
            al.add(marks);
        }

        // Initialize values
        int max = al.get(0);
        int min = al.get(0);
        int total = 0;

        // Using for-each loop
        for(int obj : al) {

            if(obj > max)
                max = obj;

            if(obj < min)
                min = obj;

            total += obj;
        }

        // Display results
        System.out.println("\nMaximum Marks: " + max);
        System.out.println("Minimum Marks: " + min);
        System.out.println("Total Marks: " + total);

        sc.close();
    }
}

//Output:
// Enter marks of five students:
// 45
// 50
// 23
// 12
// 12

// Maximum Marks: 50
// Minimum Marks: 12
// Total Marks: 142