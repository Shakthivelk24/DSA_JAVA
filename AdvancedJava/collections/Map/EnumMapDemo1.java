package Map;

/*
Write a program that defines an enum Day with 
MONDAY, TUESDAY, WEDNESDAY. 
Create an EnumMap that maps each day to a 
emd task. Display all day-task pairs.
Expected Output:
MONDAY: Team Meeting
TUESDAY: Code Review
WEDNESDAY: Testing
*/
import java.util.EnumMap;

// Defining enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY
}

public class EnumMapDemo1 {
    public static void main(String[] args) {

        // Creating EnumMap
        EnumMap<Day, String> em = new EnumMap<>(Day.class);

        // Adding day-task pairs
        em.put(Day.MONDAY, "Team Meeting");
        em.put(Day.TUESDAY, "Code Review");
        em.put(Day.WEDNESDAY, "Testing");

        // Displaying all entries
        for (Day obj : em.keySet()) {
            System.out.println(obj + ": " + em.get(obj));
        }
    }
}

// Output:
// MONDAY: Team Meeting
// TUESDAY: Code Review
// WEDNESDAY: Testing