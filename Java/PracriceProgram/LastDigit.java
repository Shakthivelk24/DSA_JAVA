import java.util.Scanner;

public class LastDigit {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = input.nextInt();
        System.out.print("The Last digit is "+(n%10));
     }
}
