import java.util.Scanner;
public class Floyd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Rows : ");
        n = input.nextInt();
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
           System.out.println();
        }
        input.close();
    }
}
// Output
// Enter the Number of Rows : 
// 5
// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
