import java.util.Scanner;

public class CountingIncreasingSegments {
    static int countIncreasingSegments(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            boolean increasing = true;

            for (int j = i; j < i + k - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    increasing = false;
                    break;
                }
            }

            if (increasing) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countIncreasingSegments(arr, k));

        sc.close();
    }
}