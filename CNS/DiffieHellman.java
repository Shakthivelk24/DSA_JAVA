import java.math.BigInteger;
import java.util.Scanner;

public class DiffieHellman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger p = new BigInteger("23");
        BigInteger g = new BigInteger("5");
        System.out.print("Enter private key of user A: ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter private key of user B: ");
        BigInteger b = sc.nextBigInteger();

        BigInteger A = g.modPow(a, p);
        BigInteger B = g.modPow(b, p);
        BigInteger secretA = B.modPow(a, p);
        BigInteger secretB = A.modPow(b, p);
        System.out.println("Shared Secret Key for A: " + secretA);
        System.out.println("Shared Secret Key for B: " + secretB);
    }
}
