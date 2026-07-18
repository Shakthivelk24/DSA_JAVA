import java.util.Scanner;

public class CommonMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        commonMultiples(n, a, b);
    }
    public static void commonMultiples(int n,int a,int b){
        int max;
        max=(a>b)?a:b;
        int lcm = max;
        while(true){
            if(lcm%a == 0 && lcm%b == 0){
                break;
            }
            lcm++;
        }
        for(int i=1;i<=n;i++){
            System.out.print(lcm*i+" ");
        }
    }
}
