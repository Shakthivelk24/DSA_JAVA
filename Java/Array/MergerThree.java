public class MergerThree {
    public static int[] mergeThree(int[] arr1, int[] arr2, int[] arr3) {
        int n = arr1.length;
        int m = arr2.length;
        int p = arr3.length;
        int[] merged = new int[n + m + p];
        int i = 0, j = 0, k = 0, l = 0;

        while (i < n || j < m || k < p) {
            int val1 = (i < n) ? arr1[i] : Integer.MAX_VALUE;
            int val2 = (j < m) ? arr2[j] : Integer.MAX_VALUE;
            int val3 = (k < p) ? arr3[k] : Integer.MAX_VALUE;

            if (val1 <= val2 && val1 <= val3) {
                merged[l++] = val1;
                i++;
            } else if (val2 <= val1 && val2 <= val3) {
                merged[l++] = val2;
                j++;
            } else {
                merged[l++] = val3;
                k++;
            }
        }

        return merged;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        int[] arr3 = {0, 7, 8};

        int[] merged = mergeThree(arr1, arr2, arr3);

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}
