package AdvancedJava.Enumeration;

/* Java Enumerations are class types */
enum Month {
    JAN(31), FEB(28), MAR(31), APR(30), MAY(31), JUNE(30),
    JULY(31), AUG(31), SEPT(30), OCT(31), NOV(30), DEC(31);

    // Instance Variable
    private int days;

    // Constructor
    Month(int d) {
        days = d;
    }

    // Method
    int getDays() {
        return days;
    }
}

public class EnumExample6 {
    public static void main(String args[]) {
        Month m;
        // Display days of June.
        System.out.println("June has " +
                Month.JUNE.getDays() +
                " days.\n");
        // Display all months and days.
        System.out.println("All Months and Days:");
        for (Month mm : Month.values())
            System.out.println(mm + " has " + mm.getDays() +
                    " days.");
    }
}
