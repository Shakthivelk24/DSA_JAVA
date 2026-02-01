import java.util.Scanner;

public class Pyramid {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Rows : ");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            if(i!=1){
              for(int j=i-1;j>0;j--){
                System.out.print(j);
            }  
            }
            System.out.println();
        } 
        input.close(); 
     } 
}
// Output
// Enter the Number of Rows : 
// 4
//    1
//   121
//  12321
// 1234321
