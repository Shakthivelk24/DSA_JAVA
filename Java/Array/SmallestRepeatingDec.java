import java.util.Scanner;
public class SmallestRepeatingDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int ans = -1;

        // Since array is in descending order,
        // traverse from the end (smallest to largest)
        for (int i = N - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                ans = arr[i];
                break;
            }
        }

        System.out.println(ans);

        scanner.close();
    }
}
