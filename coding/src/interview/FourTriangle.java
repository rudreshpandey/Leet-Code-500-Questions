package interview;
import java.util.Scanner;

public class FourTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int m = n-1;
        for(int i=1;i<n;i++){
            for(int j=1;j<=2*n;j++){
                if(j<=i) System.out.print("*");
                else if(j>2*n-i) System.out.print("*");
                else System.out.print(" ");
            }System.out.println();
        }
        for(int i=1;i<=2*n;i++) System.out.print("*");
        System.out.println();
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=2*n;j++){
                if(j<=i) System.out.print("*");
                else if(j>2*n-i) System.out.print("*");
                else System.out.print(" ");
            }System.out.println();
        }

        StragePattern stragePattern = new StragePattern();
        stragePattern.printSquare(n);
        SquarePattern sq = new SquarePattern();
        sq.printSquare(n);

    
}
}