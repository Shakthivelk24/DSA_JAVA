public class KSumPair {
    public static void main(String[] args) {
        int[] arr = {3,4,2,7,9};
        int k = 9;
        boolean found = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(k == (arr[i]+arr[j])){
                    System.out.println(arr[i]+" "+arr[j]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No pair found");
        }
    }
}
