import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Rows : ");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = n-i; j > 0 ;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i!=1){
               for(int j = 1; j <= (2*(i-2)+1) ;j++){
                    System.out.print(" ");
               }
               System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i != n-1){
                for(int j=1;j<=2*(n-1-i)-1;j++){
                    System.out.print(" ");
                }
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}
// Output
// Enter the Number of Rows : 
// 4
//    *
//   * *
//  *   *
// *     *
//  *   *
//   * *
//    *
 