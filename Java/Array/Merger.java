import java.util.Scanner;

public class Merger{
   public static int[] merge(int[] arr1, int[] arr2){
      int n = arr1.length;
      int m = arr2.length;
      int[] merged = new int[n + m];
      int i = 0, j = 0, k = 0;
      while(i < n && j < m){
         if(arr1[i] < arr2[j]){
            merged[k++] = arr1[i++];
         } else {
            merged[k++] = arr2[j++];
         }
      }
      while(i < n){
         merged[k++] = arr1[i++];
      }
      while(j < m){
         merged[k++] = arr2[j++];
      }
      return merged;
   }
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr1 = new int[n];
      for(int i = 0; i < n; i++){
         arr1[i] = sc.nextInt();
      }
      int m = sc.nextInt();
      int[] arr2 = new int[m];
      for(int i = 0; i < m; i++){
         arr2[i] = sc.nextInt();
      }
      int[] merged = Merger.merge(arr1, arr2);
      for(int i = 0; i < merged.length; i++){
         System.out.print(merged[i] + " ");
      }
      sc.close();
   }
   
}