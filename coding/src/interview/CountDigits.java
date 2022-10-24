package interview;

public class CountDigits {
    static int evenlyDivides(int N){
        // code here
        int m = N;
        int count =0;
        while(N>0){
            int q = N/10;
            int r = N%10;
            N = q;
            if(r!=0 && m%r==0) count++;
        }return count;
    }
}