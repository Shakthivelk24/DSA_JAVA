package AdvancedJava.PracriceProgram;
import java.lang.annotation.*;
import java.lang.reflect.*;

// Class annotation
@Retention(RetentionPolicy.RUNTIME)
@interface ClassInfo {
    String description();
}

// Method annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MethodInfo {
    String purpose();
    String version();
}

// Apply annotations to class
@ClassInfo(description = "Order Service Class")
class OrderService {

    @MethodInfo(purpose = "Create Order", version = "1.0")
    public void createOrder() {}

    @MethodInfo(purpose = "Cancel Order", version = "1.1")
    public void cancelOrder() {}
}

public class Main {

    public static void main(String[] args) {

        OrderService obj = new OrderService();

        try {
            // Get class annotations
            Annotation[] annos = obj.getClass().getAnnotations();

            System.out.println("All annotations for OrderService:");
            for (Annotation a : annos) {
                System.out.println(a);
            }

            // Get method annotations
            Method[] methods = obj.getClass().getDeclaredMethods();

            for (Method m : methods) {
                System.out.println("\nAnnotations for method: " + m.getName());

                Annotation[] mAnnos = m.getAnnotations();

                for (Annotation a : mAnnos) {
                    System.out.println(a);
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// Output:
// All annotations for OrderService:
// @AdvancedJava.PracriceProgram.ClassInfo(description="Order Service Class")

// Annotations for method: createOrder
// @AdvancedJava.PracriceProgram.MethodInfo(purpose="Create Order", version="1.0")

// Annotations for method: cancelOrder
// @AdvancedJava.PracriceProgram.MethodInfo(purpose="Cancel Order", version="1.1")
