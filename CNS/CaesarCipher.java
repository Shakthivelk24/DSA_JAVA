import java.util.Scanner;

public class CaesarCipher {

    // Encryption
    static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) ('A' + (ch - 'A' + key) % 26);
            } 
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) ('a' + (ch - 'a' + key) % 26);
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Decryption
    static String decrypt(String text, int key) {
        return encrypt(text, 26 - (key % 26));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plaintext = sc.nextLine();

        System.out.print("Enter key: ");
        int key = sc.nextInt();

        key = key % 26;

        String encrypted = encrypt(plaintext, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("\nEncrypted text: " + encrypted);
        System.out.println("Decrypted text: " + decrypted);

        sc.close();
    }
}