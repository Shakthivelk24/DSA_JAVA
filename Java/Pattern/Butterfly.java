import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Rows : ");
        n = scan.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*n-2*i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n-i+1;j>0;j--){
                System.out.print("*");
            }
            for(int j=1;j<=(2*i-2);j++){
                System.out.print(" ");
            }
            for(int j=n-i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
// Output
// Enter the number of Rows : 
// 5
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *
