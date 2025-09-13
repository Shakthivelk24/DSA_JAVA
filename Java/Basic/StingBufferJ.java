public class StingBufferJ {
    public static void main(String[] args) {
         // creating Java string using a new keyword
        StringBuffer str = new StringBuffer("Shakthi vel K");

        System.out.println(str);

        StringBuffer s = new StringBuffer("M S");
    
        // append() method appends the string at the end
        s.append(" Dhoni");
    
        // This will print M S Dhoni because StringBuffer objects are mutable
        System.out.println(s);

        // Declare StringBuffer without using new operator
        StringBuffer name = new StringBuffer("Hello World");

        // Prints the StringBuffer.
        System.out.println("StringBuffer name = " + name);

         // Declare StringBuffer using new operator
        StringBuffer newString = new StringBuffer("Welcome to Java Programming");

        // Prints the StringBuffer.
        System.out.println("StringBuffer newString = " + newString);

        // Creating Byte ASCII Array
        byte ascii[] = {  83, 32, 83  };

        // Creating StringBuffer using byte array
        StringBuffer firstString = new StringBuffer(new String(ascii));
        System.out.println(firstString);

        // Creating StringBuffer using byte array with  Start index to End Index
        StringBuffer secondString = new StringBuffer(new String(ascii, 1, 2));
        System.out.println(secondString);
    }
}
