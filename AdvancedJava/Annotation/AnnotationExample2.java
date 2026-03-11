package AdvancedJava.Annotation;

// Show all annotations for a class and a method.
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)

// Define an annotation that can be applied to types (classes) and is available at runtime.
@interface SampleAnno {
	String str();
	int val();
}

@Retention(RetentionPolicy.RUNTIME)
// Define an annotation that can be applied to types (classes) and methods, and is available at runtime.
@interface What {
	String description();
}

@What(description = "An annotation test class") // Annotate a class.
@SampleAnno(str = "AnnotationExample2", val = 10) // Annotate a class.
class AnnotationExample2 {
	@What(description = "An annotation test method") // Annotate a method.
	@SampleAnno(str = "myMethod", val = 999) // Annotate a method.
	public static void myMethod() {
		AnnotationExample2 ae = new AnnotationExample2();
	try {
		Annotation annos[] = ae.getClass().getAnnotations();
		// Display all annotations for AnnotationExample2.
		System.out.println("All annotations for AnnotationExample2:");
		for(Annotation a : annos)
			System.out.println(a);

		// Display all annotations for myMethod.
		Method m = ae.getClass().getMethod("myMethod");
		annos = m.getAnnotations();
		System.out.println("All annotations for myMethod:");
		for(Annotation a : annos)
			System.out.println(a);
		} catch (NoSuchMethodException exc) {
			System.out.println("Method Not Found.");
		}
	}
	public static void main(String args[]) {
		myMethod();
	}
}
//Output:
//All annotations for AnnotationExample2:
//@AdvancedJava.Annotation.What(description=An annotation test class)
//@AdvancedJava.Annotation.SampleAnno(str=AnnotationExample2, val=10)
//All annotations for myMethod:
//@AdvancedJava.Annotation.What(description=An annotation test method)
//@AdvancedJava.Annotation.SampleAnno(str=myMethod, val=999)

