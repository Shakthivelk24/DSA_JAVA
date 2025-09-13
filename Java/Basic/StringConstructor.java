public class StringConstructor {
    public static void main(String[] args) {
        // 1. String from literal
        String str1 = "Hello";
        System.out.println("1. String from literal: " + str1);

        // 2. String from another String object
        String str2 = new String(str1);
        System.out.println("2. String from another String: " + str2);

        // 3. String from char array
        char[] charArr = { 'J', 'a', 'v', 'a' };
        String str3 = new String(charArr);
        System.out.println("3. String from char array: " + str3);

        // 4. String from char array with offset and count
        String str4 = new String(charArr, 1, 2); // "av"
        System.out.println("4. String from char array (offset, count): " + str4);

        // 5. String from byte array
        byte[] byteArr = { 65, 66, 67, 68 }; // ASCII for A, B, C, D
        String str5 = new String(byteArr);
        System.out.println("5. String from byte array: " + str5);

        // 6. String from byte array with offset and length
        String str6 = new String(byteArr, 1, 2); // "BC"
        System.out.println("6. String from byte array (offset, length): " + str6);
    }
}