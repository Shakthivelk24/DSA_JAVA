import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int cel = s.nextInt();
        double fah = (cel*9.0/5)+32;

        System.out.println(fah);
    }
}
// Output
// 12
// 53.6
