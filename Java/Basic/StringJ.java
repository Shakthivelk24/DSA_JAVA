public class StringJ {
    public static void main(String args[])
    {
        // creating Java string using a new keyword
        String str = new String("Shakthi vel K");

        System.out.println(str);

         String s = "M S";
    
        // concat() method appends the string at the end
        s.concat(" Dhoni");
    
        // This will print Sachin because strings are immutable objects
        System.out.println(s);

        // Declare String without using new operator
        String name = "Hello World";

        // Prints the String.
        System.out.println("String name = " + name);

        // Declare String using new operator
        String newString = new String("Welcome to Java Programming");

        // Prints the String.
        System.out.println("String newString = " + newString);

        	// Creating Byte ASCII Array
        byte ascii[] = {  83, 32, 83  };

      	// Creating String using byte array
        String firstString = new String(ascii);
        System.out.println(firstString);

      	// Creating String using byte array with  Start index to End Index
        String secondString = new String(ascii, 1, 2);
        System.out.println(secondString);
    }
}
