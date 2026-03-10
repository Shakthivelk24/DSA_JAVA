package AdvancedJava.Autoboxing;

// A bad use of autoboxing/unboxing!
class AutoBox7 {
    public static void main(String[] args) {
		Double a, b, c;
		a = 10.0;
		b = 4.0;
		c = Math.sqrt(a*a + b*b); //Multiple unnecessary conversions happen.
		System.out.println("Hypotenuse is " + c);
	}
}
//Conclusion: For mathematical calculations - always use primitives.
// Output
// Hypotenuse is 10.770329614269007
