import java.util.*;

public class PlayfairCipher {

    static char[][] matrix = new char[5][5];

    // Generate 5x5 matrix
    static void generateMatrix(String key) {
        key = key.toUpperCase().replace("J", "I");

        String s = "";

        for (char c : key.toCharArray()) {
            if (c >= 'A' && c <= 'Z' && s.indexOf(c) == -1)
                s += c;
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            if (c == 'J')
                continue;

            if (s.indexOf(c) == -1)
                s += c;
        }

        int k = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = s.charAt(k++);
            }
        }
    }

    // Find position of character
    static int[] position(char c) {
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                if (matrix[i][j] == c)
                    return new int[]{i, j};

        return null;
    }

    // Encryption
    static String encrypt(String text) {

        text = text.toUpperCase()
                   .replace("J", "I")
                   .replaceAll("[^A-Z]", "");

        String result = "";

        for (int i = 0; i < text.length(); i += 2) {

            char a = text.charAt(i);

            char b;

            if (i + 1 >= text.length())
                b = 'X';
            else
                b = text.charAt(i + 1);

            // Same letters
            if (a == b) {
                b = 'X';
                i--;
            }

            int[] p1 = position(a);
            int[] p2 = position(b);

            // Same row
            if (p1[0] == p2[0]) {
                result += matrix[p1[0]][(p1[1] + 1) % 5];
                result += matrix[p2[0]][(p2[1] + 1) % 5];
            }

            // Same column
            else if (p1[1] == p2[1]) {
                result += matrix[(p1[0] + 1) % 5][p1[1]];
                result += matrix[(p2[0] + 1) % 5][p2[1]];
            }

            // Rectangle rule
            else {
                result += matrix[p1[0]][p2[1]];
                result += matrix[p2[0]][p1[1]];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter key: ");
        String key = sc.nextLine();

        System.out.print("Enter plaintext: ");
        String plaintext = sc.nextLine();

        generateMatrix(key);

        System.out.println("\nKey Matrix:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        System.out.println("\nEncrypted Text: " + encrypt(plaintext));

        sc.close();
    }
}