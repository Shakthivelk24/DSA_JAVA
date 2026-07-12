import java.util.Scanner;

public class HollowTriangle {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(i==n-1 || j==0 || j==i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }  
  }  
}

// 5
//     * 
//    * * 
//   *   * 
//  *     * 
// * * * * * 
