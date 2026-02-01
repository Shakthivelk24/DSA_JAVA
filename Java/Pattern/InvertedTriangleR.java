import java.util.Scanner;

public class InvertedTriangleR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Rows : ");
        n = input.nextInt();
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
        input.close();
    }
}
// Output
// Enter the Number of Rows : 
// 4
// 1111
// 222
// 33
// 4
