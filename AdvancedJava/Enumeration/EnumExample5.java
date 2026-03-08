package AdvancedJava.Enumeration;

/* values() and valueOf()*/

enum Color {
    RED,
    GREEN,
    BLUE;
}

public class EnumExample5 {
    public static void main(String[] args) {
        System.out.println("Color Constants:");
		// use values()
		Color colors[] = Color.values();
		for(Color cc : colors)
			System.out.println(cc);

		// use valueOf()
		Color c = Color.valueOf("RED");
		System.out.println("Color contains " + c);
    }
}
// Output
// Color Constants:
// RED
// GREEN
// BLUE
// Color contains RED
