package Java.PracriceProgram;

import java.util.Scanner;

public class PrintPrime {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter count and starting point: ");
        int count = sc.nextInt(); // how many primes
        int start = sc.nextInt(); // starting point

        int limit = start + 100; 

        boolean[] isPrime = sieve(limit);

        int found = 0;
        for (int i = start + 1; i <= limit && found < count; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                found++;
            }
        }
    }

    static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];

        // mark all as true initially
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        return prime;
    }
}
// Time Complexity: O(n log log n) for sieve, O(count) for printing primes
// Space Complexity: O(n) for sieve array
// Output:
// Enter count and starting point: 
// 5 10
// 11 13 17 19 23 