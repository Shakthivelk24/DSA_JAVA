package AdvancedJava.Autoboxing;

/* Autoboxing - when Integer is null */
class AutoBox6 {
    public static void main(String[] args) {
        Integer x = null;
		int y = x;   //Runtime error - Causes NullPointerException because unboxing null is not possible.
		
		System.out.println(y);
    }
}
// Output
// Exception in thread "main" java.lang.NullPointerException
