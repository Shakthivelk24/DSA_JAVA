import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int n;
         System.out.println("Enter the Number of Rows : ");
         n = input.nextInt();
         for(int i=0;i<n;i++){
            char c = 'A';
            for(int j=0;j<n;j++){      
                  System.out.print(c);
                  c+=1;
            }
            System.out.println();
         }
    }
}
// Output
// Enter the Number of Rows : 
// 5
// ABCDE
// ABCDE
// ABCDE
// ABCDE
// ABCDE