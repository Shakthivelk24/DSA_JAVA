import java.util.Scanner;

public class RepeatingElements {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Read array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean found = false;

        // Find repeating elements
        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Print only once
            if (count > 1) {
                boolean printed = false;

                for (int k = 0; k < i; k++) {
                    if (arr[k] == arr[i]) {
                        printed = true;
                        break;
                    }
                }

                if (!printed) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.print(-1);
        }

        scanner.close();
    }
}
