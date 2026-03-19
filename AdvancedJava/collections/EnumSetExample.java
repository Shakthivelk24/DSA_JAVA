/* A college timetable system stores working days 
and weekend days using EnumSet. */

import java.util.*;

// Step 1: Define Enum
enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

// Step 2: Main Class
public class EnumSetExample {

    public static void main(String[] args) {

        // Creating EnumSet for working days
        EnumSet<Day> workingDays =
                EnumSet.range(Day.MONDAY, Day.FRIDAY);

        // Creating EnumSet for weekend
        EnumSet<Day> weekend =
                EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        // Display working days
        System.out.println("Working Days:");
        for (Day d : workingDays) {
            System.out.println(d);
        }

        // Display weekend days
        System.out.println("\nWeekend Days:");
        for (Day d : weekend) {
            System.out.println(d);
        }

        // Checking a day
        if (workingDays.contains(Day.MONDAY)) {
            System.out.println("\nMonday is a working day.");
        }

        // Adding a holiday
        workingDays.remove(Day.FRIDAY);
        System.out.println("\nAfter declaring Friday as holiday:");
        System.out.println(workingDays);
    }
}

/*
range() - creates a set containing all enum constants between two values.
It includes both start and end values.

of() - creates a set with specific enum constants.
*/

// Output:
// Working Days:
// MONDAY
// TUESDAY
// WEDNESDAY
// THURSDAY
// FRIDAY

// Weekend Days:
// SATURDAY
// SUNDAY

// Monday is a working day.

// After declaring Friday as holiday:
// [MONDAY, TUESDAY, WEDNESDAY, THURSDAY]