package interview;
import java.util.Scanner;

public class TwoSideTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=n-i+1;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=n+1;j<=2*n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if(j<=i) System.out.print("*");
                else if(j>(2*n-i)) System.out.print("*");
                else System.out.print(" ");
            }System.out.println();
        }
    }
}