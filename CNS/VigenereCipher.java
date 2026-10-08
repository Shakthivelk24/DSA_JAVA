import java.util.Scanner;

public class VigenereCipher {

    static String encrypt(String text, String key) {
        String result = "";
        key = key.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char p = text.charAt(i);
            char k = key.charAt(i % key.length());

            int value = ((p - 'A') + (k - 'A')) % 26;
            result += (char) (value + 'A');
        }

        return result;
    }

    static String decrypt(String text, String key) {
        String result = "";
        key = key.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            char k = key.charAt(i % key.length());

            int value = ((c - 'A') - (k - 'A') + 26) % 26;
            result += (char) (value + 'A');
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plaintext = sc.nextLine().toUpperCase();

        System.out.print("Enter key: ");
        String key = sc.nextLine().toUpperCase();

        String encrypted = encrypt(plaintext, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("Encrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);

        sc.close();
    }
}