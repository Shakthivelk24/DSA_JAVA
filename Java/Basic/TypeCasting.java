public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        int intVal = 100;
        double doubleVal = intVal; // int to double
        System.out.println("Implicit casting (int to double): " + doubleVal);

        // Explicit casting (narrowing)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // double to int
        System.out.println("Explicit casting (double to int): " + anotherInt);

        // Char to int (implicit)
        char ch = 'A';
        int chInt = ch;
        System.out.println("Char to int (implicit): " + chInt);

        // Int to char (explicit)
        int num = 66;
        char numChar = (char) num;
        System.out.println("Int to char (explicit): " + numChar);

        int largeNum = 130;
        float floatnum = 550.66f;
        System.out.println("Automated Type casting in expression :" +(largeNum+floatnum)); // int to long (implicit)
   }
}
