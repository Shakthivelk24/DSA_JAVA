import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

public class DESDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter text to encrypt: ");
            String plainText = sc.nextLine();
            KeyGenerator keyGen = KeyGenerator.getInstance("DES");
            SecretKey secretKey = keyGen.generateKey();
            Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            desCipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] encryptedBytes = desCipher.doFinal(plainText.getBytes());
            String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

            desCipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = desCipher.doFinal(encryptedBytes);
            String decryptedText = new String(decryptedBytes);

            System.out.println("\n----- DES Encryption Demonstration	");

            System.out.println("Original Text	: " + plainText);
            System.out.println("Encrypted Text		: " + encryptedText);
            System.out.println("Decrypted Text		 : " + decryptedText);
            System.out.println("			");

            String encodedKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
            System.out.println("Secret Key (Base64): " + encodedKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
