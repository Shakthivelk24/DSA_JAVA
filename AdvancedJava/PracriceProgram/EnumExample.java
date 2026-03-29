package AdvancedJava.PracriceProgram;

// Write a Java program using enumerations (enum) for the following requirements:
// Create an enum with 6 constants namely:
// CSE, ISE, ECE, EEE, ME, CV
// Each constant should have two values:
// Dept_ID
// Description
// Example:
// CSE("GATCSE1", "Computer Science Engg")
// Write code to retrieve all enum constants and display their values using a for-each loop.
// Enum declaration
enum Department {
    CSE("GATCSE1", "Computer Science Engg"),
    ISE("GATISE1", "Information Science Engg"),
    ECE("GATECE1", "Electronics and Communication Engg"),
    EEE("GATEEE1", "Electrical and Electronics Engg"),
    ME("GATME1", "Mechanical Engg"),
    CV("GATCV1", "Civil Engg");

    private String deptId;
    private String description;

    // Constructor
    Department(String deptId, String description) {
        this.deptId = deptId;
        this.description = description;
    }

    // Getter methods
    public String getDeptId() {
        return deptId;
    }

    public String getDescription() {
        return description;
    }
}

// Main class
public class EnumExample {
    public static void main(String[] args) {

        // Using for-each loop to display enum values
        for (Department dept : Department.values()) {
            System.out.println("Department: " + dept);
            System.out.println("Dept ID: " + dept.getDeptId());
            System.out.println("Description: " + dept.getDescription());
            System.out.println("----------------------------");
        }
    }
}

// Output:
// Department: CSE
// Dept ID: GATCSE1
// Description: Computer Science Engg
// ----------------------------
// Department: ISE
// Dept ID: GATISE1
// Description: Information Science Engg
// ----------------------------
// Department: ECE
// Dept ID: GATECE1
// Description: Electronics and Communication Engg
// ----------------------------
// Department: EEE
// Dept ID: GATEEE1
// Description: Electrical and Electronics Engg
// ----------------------------
// Department: ME
// Dept ID: GATME1
// Description: Mechanical Engg
// ----------------------------
// Department: CV
// Dept ID: GATCV1
// Description: Civil Engg
// ----------------------------
