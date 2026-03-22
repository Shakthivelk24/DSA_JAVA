package Java.PracriceProgram;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}

//  Time Complexity: O(sqrt(n))
//  Space Complexity: O(1)
// Output:
// Enter a number: 7
// Prime Number
