public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setName("Rahul");
        obj.setAge(20);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
class Student {
    // Private variables (data hiding)
    private String name;
    private int age;

    // Public setter method to update data
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // Public getter method to access data
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
