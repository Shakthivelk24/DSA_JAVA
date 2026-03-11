package AdvancedJava.Annotation;

// Show annotation for a method.
import java.lang.annotation.*;
import java.lang.reflect.*;
// Define an annotation that can be applied to methods and is available at runtime.
@Retention(RetentionPolicy.RUNTIME)
@interface SampleAnno {
	//In annotation, elements like str() and val() are abstract methods, not variables. 
	//They are implicitly public and abstract.
	String str(); 
	int val(); 
} 
class AnnotationExample1 {
	// Annotate a method.
	@SampleAnno(str = "Annotation Example", val = 1)
	public static void myMethod() {
	AnnotationExample1 ae = new AnnotationExample1();
	try {
	Method m = ae.getClass().getMethod("myMethod");
	SampleAnno s = m.getAnnotation(SampleAnno.class); // Get the annotation for this method.
	System.out.println(s.str() + " " + s.val()); // Display the values stored in the annotation.
		
	} catch (NoSuchMethodException exc) {
		System.out.println("Method Not Found.");
	}
	}

	public static void main(String args[]) {
		myMethod();
	}
}

//Output:
//Annotation Example 1
