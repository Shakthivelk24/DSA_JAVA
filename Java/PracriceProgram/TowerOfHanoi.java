import java.util.Scanner;

public class TowerOfHanoi {
    static void TOH(char A,char B,char C,int n){
        if(n==1){
            System.out.println(A+" to "+B);
        }else{
            TOH(A, C, B, n-1);
            System.out.println(A+" to "+B);
            TOH(C, B, A, n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        TOH('A','B','C',n);
    }
}
// OutPut 
// Enter a number : 
// 3
// A to B
// A to C
// B to C
// A to B
// C to A
// C to B
// A to B
