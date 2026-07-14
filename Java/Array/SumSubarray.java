public class SumSubarray {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,9,3,1,3,3};
        int n = arr.length;
        int subarraySize = 3; 

        for (int i = 0; i <= n - subarraySize ; i++) {
            int sum = 0;
            for(int j=i;j<subarraySize+i;j++){
                sum += arr[j];
             }
             System.out.println(sum);
        }
    }
}

// 8
// 7
// 15
// 16
// 13
// 7
// 7
