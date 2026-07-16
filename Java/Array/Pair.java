public class Pair{
    public static void main(String[] args) {
        int[] n = {3,2,7,4,9};
        // int k = 9;
        for(int i=0;i<n.length-1;i++){
            for(int j=i+1;j<n.length;j++){
                System.out.println(n[i]+" "+n[j]);
            }
        }
    }
}
// 3 2
// 3 7
// 3 4
// 3 9
// 2 7
// 2 4
// 2 9
// 7 4
// 7 9
// 4 9