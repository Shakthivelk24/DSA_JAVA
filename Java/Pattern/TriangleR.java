import java.util.Scanner;
public class TriangleR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Rows : ");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        input.close();
    }
}
// Output
// Enter the Number of Rows : 
// 5
// *
// **
// ***
// ****
// *****
// 1
// 12
// 123
// 1234
// 12345
// 1
// 21
// 321
// 4321
// 54321

