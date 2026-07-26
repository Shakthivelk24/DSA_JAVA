import java.util.Scanner;

public class SmallestRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        // Read the array
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int smallest = Integer.MAX_VALUE;

        // Find the smallest repeating element
        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1 && arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        if (smallest == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(smallest);
        }

        scanner.close();
    }
}