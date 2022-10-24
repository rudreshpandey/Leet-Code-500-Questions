package interview;
import java.util.Scanner;

public class Cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int mid = n/2+1;
        for(int i=0;i<mid;i++){
            for(int j=1;j<=n;j++){
                if(mid-i<=j && j<=mid+i)
                System.out.print("*");
                else System.out.print(" ");

            }System.out.println();
        }

    }
}