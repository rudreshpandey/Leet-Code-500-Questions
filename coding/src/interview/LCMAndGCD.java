package interview;

public class LCMAndGCD {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long [] arr = new Long[2];
        arr[1] = hcf(A,B);
        arr[0] = (A*B)/arr[1];
        return arr;
    }
    
    static Long hcf(Long a,Long b){
        long q = a/b;
        long r = a%b;
        if(r==0)return b;
        else return hcf(b,r);
    }
    
}