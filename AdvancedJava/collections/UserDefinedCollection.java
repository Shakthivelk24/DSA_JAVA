// A simple mailing list example.
import java.util.*;


class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Address(String n, String s, String c, String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + "\n" + street + "\n" +
               city + " " + state + " " + code;
    }
}

class UserDefinedCollection {
    public static void main(String args[]) {

        LinkedList<Address> ml = new LinkedList<Address>();
	
		// Add addresses
        ml.add(new Address("Arjun Kumar", "MG Road",
                "Bengaluru", "Karnataka", "560001"));

        ml.add(new Address("Sneha", "Tilakwadi",
                "Belagavi", "Karnataka", "590006"));

        ml.add(new Address("Karthik Shetty", "Lalbagh Road",
                "Mangaluru", "Karnataka", "575001"));

        // Display the mailing list
        for(Address obj : ml)
            System.out.println(obj + "\n");

        System.out.println();
    }
}
// Output:
// Arjun Kumar
// MG Road
// Bengaluru Karnataka 560001

// Sneha
// Tilakwadi
// Belagavi Karnataka 590006

// Karthik Shetty
// Lalbagh Road
// Mangaluru Karnataka 575001

