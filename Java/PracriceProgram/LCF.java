// LCF Excluding 1,2

import java.util.Scanner;

public class LCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = (n<m)?n:m;
        for(int i=3;i<=min;i++){
            if(n%i == 0 && m%i == 0){
                System.out.print(i);
                break;
            }
        }
    }
}
