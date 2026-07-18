import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        while (m!=0) {
            int rem = n%m;
            n=m;
            m=rem;
        }
        System.out.print(n);
        sc.close();
    }
}
