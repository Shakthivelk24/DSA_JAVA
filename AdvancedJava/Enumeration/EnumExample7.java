package AdvancedJava.Enumeration;

// Demonstrate ordinal(), compareTo(), and equals().
enum Color { RED, GREEN, BLUE; }


public class EnumExample7 {
    public static void main(String args[])
	{
		Color c1, c2, c3;
		// Obtain all ordinal values using ordinal().
		System.out.println("Color constants and ordinal values:");
		for(Color c: Color.values())
			System.out.println(c + " " + c.ordinal());

		c1 = Color.RED;
		c2 = Color.GREEN;
		c3 = Color.RED;

		// Demonstrate compareTo() and equals()
		if(c1.compareTo(c2) < 0)
			System.out.println(c1 + " comes before " + c2);
		if(c1.compareTo(c2) > 0)
			System.out.println(c1 + " comes after " + c2);
		if(c1.compareTo(c3) == 0)
			System.out.println(c1 + " equals " + c3);

		if(c1.equals(c2))
			System.out.println(c1 + " equals " + c2);
		if(c1.equals(c3))
			System.out.println(c1 + " equals " + c3);

		if(c1 == c3)
			System.out.println(c1 + " == " + c3);
	}
}

// Output
// Color constants and ordinal values:
// RED 0
// GREEN 1
// BLUE 2
// RED comes before GREEN
// RED equals RED
// RED == RED