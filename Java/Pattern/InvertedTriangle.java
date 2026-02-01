import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Rows : ");
        n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        input.close();
    }
}

// Enter the Number of Rows : 
// 5
// 5 4 3 2 1 
//  4 3 2 1
//   3 2 1
//    2 1
//     1
// * * * * *
//  * * * *
//   * * *
//    * *
//     *