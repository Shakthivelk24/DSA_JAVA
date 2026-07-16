public class OddEvenPair {
    public static void main(String[] args) {
        int[] arr = {3,4,2,7,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]%2 != 0 && arr[j]%2 == 0){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
