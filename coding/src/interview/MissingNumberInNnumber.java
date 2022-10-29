package interview;

public class MissingNumberInNnumber {
    public static int missingNumber(int A[], int N)
    {
        // Your code goes here

        //Method-1 -> can overflow
        int sum =0;
        for(int i=0;i<N;i++) sum +=A[i];
        //return (N*(N+1)-2*sum)/2;
        
        int n=N;
        //Method-2-> safe method
        int total = 1;
        for (int i = 2; i < (n + 1); i++) {
            total += i;
            total -= A[i - 2];
        }
        return total;
    }
    
}