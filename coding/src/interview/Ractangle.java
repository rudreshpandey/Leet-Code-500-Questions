package interview;

import java.util.Scanner;

public class Ractangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();
        int r,c;
        r = c = n;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            System.out.print("*");
            System.out.println();
        }
    }
    
}