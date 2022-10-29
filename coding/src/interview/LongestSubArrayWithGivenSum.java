package interview;
import java.util.*;

public class LongestSubArrayWithGivenSum {
    public static int lenOfLongSubarr (int A[], int N, int K) {
        //Method-1
        int size =0;
        int arr[] =A;
        for(int i=0;i<N;i++){
            int arr_sum=0;
            for(int j=i;j<N;j++){
                arr_sum+=arr[j];
                if(arr_sum==K && size<j-i+1) size =j-i+1; 
                
            }
        }
        //return size;
        
        //Method-2->efficient approach->order of n
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int k=K;
        int max_len =0;
        for(int i=0;i<N;i++){
            sum +=arr[i];
            if(sum==K) max_len =i+1;
            if(!map.containsKey(sum)) map.put(sum,i);
            if(map.containsKey(sum-k)){
                max_len =Math.max(max_len,i-map.get(sum-k));
            }
        }return max_len;
        
    }
    
    
}