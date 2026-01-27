import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = input.nextInt();

        int reverse = 0;
        int zeroCount = 0;
        boolean zeroPart = true;

        while (n > 0) {
            int digit = n % 10;

            if (digit == 0 && zeroPart) {
                zeroCount++;
            } else {
                zeroPart = false;
                reverse = (reverse * 10) + digit;
            }

            n = n / 10;
        }

        while (zeroCount > 0) {
            System.out.print(0);
            zeroCount--;
        }

        System.out.println(reverse);
    }
}
// Output
// 1)Enter a number : 
// 1000 
// 0001

// 2)Enter a number : 
// 1234
// 4321
