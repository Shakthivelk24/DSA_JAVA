package AdvancedJava.Enumeration;

/* enum - loop*/
enum Color {
    RED,
    GREEN,
    BLUE;
}

public class EnumExample4 {
    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c);
        }
    }
}
// Output
// RED
// GREEN
// BLUE
