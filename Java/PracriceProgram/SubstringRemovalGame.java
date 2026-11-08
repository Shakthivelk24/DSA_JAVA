import java.util.Scanner;

public class SubstringRemovalGame {
    static String findWinner(String s) {

        int vowels = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        if (vowels % 2 == 1) {
            return "Alex";
        } else {
            return "Chris";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            System.out.println(findWinner(s));
        }

        sc.close();
    }
}
