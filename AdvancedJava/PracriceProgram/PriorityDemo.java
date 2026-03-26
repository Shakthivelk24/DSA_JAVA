// Write a custom annotation @Priority(int level).
// Apply it to methods and use reflection to print each method's priority level. 

import java.lang.annotation.*;
import java.lang.reflect.*;

// Define single-member annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Priority {
    int value();   // single member
}

// Class with annotated methods
class Task {

    @Priority(1)
    public void task1() {}

    @Priority(2)
    public void task2() {}

    @Priority(3)
    public void task3() {}
}

// Main class to read annotation
public class PriorityDemo {
    public static void main(String[] args) {

        Method[] methods = Task.class.getDeclaredMethods();

        for (Method m : methods) {
            if (m.isAnnotationPresent(Priority.class)) {
                Priority p = m.getAnnotation(Priority.class);
                System.out.println(m.getName() + " -> Priority: " + p.value());
            }
        }
    }
}

// Output:
// task1 -> Priority: 1
// task2 -> Priority: 2
// task3 -> Priority: 3