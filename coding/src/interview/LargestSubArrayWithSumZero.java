package interview;
import java.util.*;
public class LargestSubArrayWithSumZero {
    int maxLen(int arr[], int n)
    {
        // Your code here
        //int []a = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        int res=0;
        int max=0;
        map.put(0,-1);
        for(int i=0;i<n;i++){
            res+=arr[i];
            if(!map.containsKey(res)) map.put(res,i);
            else max = Math.max(max,i-map.get(res));
        }
        return max;
    }
}