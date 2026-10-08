import java.util.*;

public class HillCipher {

    static int modInverse(int a) {
        a = a % 26;

        for (int i = 1; i < 26; i++) {
            if ((a * i) % 26 == 1)
                return i;
        }

        return -1;
    }

    static String encrypt(String text, int[][] key) {
        StringBuilder result = new StringBuilder();

        // Add X if length is odd
        if (text.length() % 2 != 0)
            text += "X";

        for (int i = 0; i < text.length(); i += 2) {

            int x = text.charAt(i) - 'A';
            int y = text.charAt(i + 1) - 'A';

            int c1 = (key[0][0] * x + key[0][1] * y) % 26;
            int c2 = (key[1][0] * x + key[1][1] * y) % 26;

            result.append((char) (c1 + 'A'));
            result.append((char) (c2 + 'A'));
        }

        return result.toString();
    }

    static String decrypt(String text, int[][] key) {

        int determinant = key[0][0] * key[1][1]
                        - key[0][1] * key[1][0];

        determinant = (determinant % 26 + 26) % 26;

        int inverseDet = modInverse(determinant);

        if (inverseDet == -1) {
            return "Invalid Key Matrix";
        }

        // Inverse matrix
        int[][] inverse = new int[2][2];

        inverse[0][0] = (key[1][1] * inverseDet) % 26;
        inverse[0][1] = (-key[0][1] * inverseDet) % 26;
        inverse[1][0] = (-key[1][0] * inverseDet) % 26;
        inverse[1][1] = (key[0][0] * inverseDet) % 26;

        // Make values positive
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                inverse[i][j] = (inverse[i][j] + 26) % 26;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i += 2) {

            int x = text.charAt(i) - 'A';
            int y = text.charAt(i + 1) - 'A';

            int p1 = (inverse[0][0] * x + inverse[0][1] * y) % 26;
            int p2 = (inverse[1][0] * x + inverse[1][1] * y) % 26;

            result.append((char) (p1 + 'A'));
            result.append((char) (p2 + 'A'));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter plaintext: ");
        String plaintext = sc.nextLine().toUpperCase();

        // Remove spaces and special characters
        plaintext = plaintext.replaceAll("[^A-Z]", "");

        int[][] key = new int[2][2];

        System.out.println("Enter 2x2 key matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                key[i][j] = sc.nextInt();
            }
        }

        String encrypted = encrypt(plaintext, key);
        String decrypted = decrypt(encrypted, key);

        System.out.println("\nEncrypted Text: " + encrypted);
        System.out.println("Decrypted Text: " + decrypted);

        sc.close();
    }
}