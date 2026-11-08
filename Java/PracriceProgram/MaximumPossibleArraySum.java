import java.util.Scanner;

public class MaximumPossibleArraySum {
    static int maxSum(int[] arr) {

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int num : arr) {

            sum += Math.abs(num);

            if (num < 0) {
                negativeCount++;
            }

            min = Math.min(min, Math.abs(num));
        }

        if (negativeCount % 2 != 0) {
            sum = sum - 2 * min;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxSum(arr));

        sc.close();
    }
}
