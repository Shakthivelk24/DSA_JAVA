import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int far = s.nextInt();

        double cel = (far-32)*5.0/9;

        System.out.printf("%.4f",cel);

        s.close();
    }
}

// Output:
// 56
// 13.3333
