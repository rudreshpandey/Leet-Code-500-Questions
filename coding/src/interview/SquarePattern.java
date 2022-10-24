package interview;

public class SquarePattern {
    void printSquare(int n) {
        // code here
        //for(int i=0;i<)
        
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=0;j<n;j++) System.out.print("*");
            }
            else{
                for(int j=0;j<n;j++){
                    if(j==0 || j==n-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
}
    
}