package AdvancedJava.Autoboxing;

// An error produced by manual unboxing.
/* Variation - 1*/

// This code will compile but will not produce the expected output because of the incorrect use of byteValue() method which returns a byte value that cannot hold the value 1000, resulting in data loss and an incorrect output.
// class UnboxingError {
// 	public static void main(String args[]) {
// 		Integer iOb = 1000; // autobox the value 1000
// 		int i = iOb.byteValue(); // manually unbox as byte !!!
// 		System.out.println(i); // does not display 1000 !
// 	}
// }


/* Variation - 2*/
// This code will compile and run without errors, but it will produce the expected output of 1000 because the autoboxing and unboxing are handled correctly by the Java compiler, allowing the Integer object to be directly assigned to an int variable without any issues.
// class UnboxingError {
// 	public static void main(String args[]) {
// 		Integer iOb = 1000; // autobox the value 1000
// 		int i = iOb.intValue(); // Correct manual unboxing
// 		System.out.println(i); // 1000
// 	}
// }



/* Variation - 2*/
// This code will compile and run without errors, but it will produce the expected output of 1000 because the autoboxing and unboxing are handled correctly by the Java compiler, allowing the Integer object to be directly assigned to an int variable without any issues.
class UnboxingError {
	public static void main(String args[]) {
		Integer iOb = 1000; // autobox the value 1000
		int i = iOb; // unboxing
		System.out.println(i); // 1000 
	}
}


