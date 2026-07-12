import java.util.Scanner;

public class DollarToRupee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int d = scan.nextInt();

        double r = d * 82.73;

        System.out.printf("%.4f", r);
    }
}
// Output
// 1
// 82.7300
