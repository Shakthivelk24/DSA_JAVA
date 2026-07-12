import java.util.Scanner;

public class ReactanglePerimeter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int l = s.nextInt();
        int w = s.nextInt();
        int perimeter = 2 *(l+w);
        System.out.print(perimeter);
    }
}

// Output
// 2
// 4
// 12
