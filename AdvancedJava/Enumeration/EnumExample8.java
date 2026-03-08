package AdvancedJava.Enumeration;

//Enum with Constructor & Method (Advanced)
enum Status {
    SUCCESS(200),
    ERROR(500);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}

public class EnumExample8 {
    public static void main(String[] args) {
        Status s = Status.SUCCESS;
        System.out.println("Code: " + s.getCode());
    }
}
// Output
// Code: 200
