import java.util.Scanner;

public class RailFenceCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String text = sc.nextLine();
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        String[] rails = new String[key];
        for (int i = 0; i < key; i++)
            rails[i] = "";
        int row = 0, dir = 1;
        for (char ch : text.toCharArray()) {
            rails[row] += ch;
            if (row == 0)
                dir = 1;
            else if (row == key - 1)
                dir = -1;
            row += dir;
        }
        String cipher = String.join("", rails);
        System.out.println("Encrypted Text: " + cipher);
    }
}
