package interview;

public class StragePattern {
    void printSquare(int n) {
        // code here
        int m =2*n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j<i) System.out.print((n-j)+" ");
                else if(j>m-1-i) System.out.print((j-n+2)+" ");
                else System.out.print((n-i)+" ");
                
            }System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<m;j++){
                if(j<i) System.out.print((n-j)+" ");
                else if(j>m-1-i) System.out.print((j-n+2)+" ");
                else System.out.print((n-i)+" ");
                
            }System.out.println();
        }
    }
    
}