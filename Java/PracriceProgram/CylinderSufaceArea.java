import java.util.Scanner;
public class CylinderSufaceArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int h = scan.nextInt();

        double pi = 3.142;

        double area = 2 * pi * r *(r+h);

        System.out.printf("%.4f",area);

        scan.close();
    }
}
// Output
// 7 
// 13
// 879.7600