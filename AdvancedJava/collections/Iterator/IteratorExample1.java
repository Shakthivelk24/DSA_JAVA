package Iterator;

import java.util.*;

public class IteratorExample1 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Python");
        al.add("C++");
			
		
		Iterator<String> it = al.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
		
    }
}
//Output:
//Java
//Python
//C++
