public class Subarray {
    public static void main(String[] args) {
        int[] arr = {5,1,2,4,9,3,1,3,3};
        int n = arr.length;
        int subarraySize = 3; 

        for (int i = 0; i <= n - subarraySize ; i++) {
             for(int j=i;j<subarraySize+i;j++){
                System.out.print(arr[j]);
             }
             System.out.println();
        }
    }
}