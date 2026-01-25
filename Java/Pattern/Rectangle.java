import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Rows : ");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            if( i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            if (i != 1 && i != n) {
                System.out.print("*");
                for(int j=1;j<=n-2;j++){
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
// 7
// *******
// *     *
// *     *
// *     *
// *     *
// *     *
// *******
