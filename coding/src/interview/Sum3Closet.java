package interview;
import java.util.*;
public class Sum3Closet {

    //https://practice.geeksforgeeks.org/problems/3-sum-closest/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=3-sum-closest
    static int closest3Sum(int A[], int N, int X)
    {
        Arrays.sort(A);
        int min = Integer.MAX_VALUE;
        int result =X;
        for(int i=0;i<N;i++){
            int a = A[i];
            int j=0,k=N-1;
            while(j<k){
                if(j==i){
                    j++;
                    continue;
                }else if(k==i){
                    k--;
                    continue;
                }else{
                    int sum = a+A[j]+A[k];
                    int dif = Math.abs(X-sum);
                    if(dif<min){
                        result = sum;
                        min = dif;
                    }
                    
                    if(sum<X) j++;
                    else if(sum>X) k--;
                    else return X;
                    
                }
                
            }
        }
        return result;
    }
    
}