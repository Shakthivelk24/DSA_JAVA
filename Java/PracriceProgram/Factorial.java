import java.util.Scanner;

public class Factorial {
     int fact(int n){
        if(n==1){
            return 1;
        }else{
            return fact(n-1)*n;
        }
     }
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();  
        Factorial fact = new Factorial();
        int res = fact.fact(n);
        System.out.println("Result is " + res);
     }
}
