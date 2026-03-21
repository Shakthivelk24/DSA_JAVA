package Queue;

/* A hospital system treats patients based on 
priority (higher priority patients are treated first).

PriorityQueue automatically orders elements based 
on priority instead of insertion order. */

import java.util.*;

// Patient class
class Patient implements Comparable<Patient> {
    String name;
    int priority;   // smaller number = higher priority

    Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Priority comparison
    public int compareTo(Patient p) {
        return this.priority - p.priority;
    }

    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {

        // Creating PriorityQueue
        PriorityQueue<Patient> queue = new PriorityQueue<>();

        // Adding patients
        queue.add(new Patient("Ravi", 3));
        queue.add(new Patient("Anita", 1));
        queue.add(new Patient("Kiran", 2));

        System.out.println("Patients treated in priority order:");

        // Removing patients based on priority
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
//Output:
//Patients treated in priority order:
//Anita (Priority: 1)
//Kiran (Priority: 2)
//Ravi (Priority: 3)
