import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a range : ");
        int n = input.nextInt();
        System.out.println("The Fibonacci Series is ");
        for(int i=0;i<n;i++){
            System.out.print(" "+fib(i)+" ");
        }
    }
}
// Output 
// Enter a range : 
// 5
// The Fibonacci Series is 
//  0  1  1  2  3