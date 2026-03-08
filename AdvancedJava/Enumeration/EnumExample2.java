package AdvancedJava.Enumeration;

public class EnumExample2 {
    enum Color {
		RED,
		GREEN,
		BLUE;
	}
    public static void main(String[] args)
    {
        Color c = Color.BLUE;
        System.out.println(c);
    }
}

// Output
// BLUE