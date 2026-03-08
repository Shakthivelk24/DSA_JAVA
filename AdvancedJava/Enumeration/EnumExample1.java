package AdvancedJava.Enumeration;
/* enum outside the class*/
enum Color {
    RED,
    GREEN,
    BLUE;
}
public class EnumExample1 {
    public static void main(String[] args) {
        Color c = Color.BLUE;
        System.out.println(c);
    }
}
// Output
// BLUE
