package interview;
import java.util.Scanner;

public class TwoTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }System.out.println();
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}