import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        InnerRecursion result = new InnerRecursion();
        System.out.println("Result is "+result.fun(n));
        input.close();
    }
}
class InnerRecursion {
   int fun(int n){
      if(n==1){
         return 1;
      }else{
         return 1+fun(n-1);
      }
   }  
}
// Output
// Enter a number : 
// 4
// Result is 4
// Explaination :
// fun(4) || return is 4
//   |
// return 1 + fun(3) || 1 + 3 = 4
//   |
// return 1 + fun(2) || 1 + 2 = 3
//   |
// return 1 + fun(1) || 1 + 1 = 2
//   |
// return 1