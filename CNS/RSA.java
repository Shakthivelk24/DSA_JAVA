import java.math.BigInteger;
import java.util.Scanner;

public class RSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger p = new BigInteger("61");
        BigInteger q = new BigInteger("53");
        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        BigInteger e = new BigInteger("17");
        BigInteger d = e.modInverse(phi);
        System.out.print("Enter plaintext (number < 3233): ");
        BigInteger m = sc.nextBigInteger();
        BigInteger c = m.modPow(e, n);
        System.out.println("Encrypted: " + c);
        BigInteger decrypted = c.modPow(d, n);
        System.out.println("Decrypted: " + decrypted);
    }
}
