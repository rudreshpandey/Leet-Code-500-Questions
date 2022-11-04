package interview;

import java.util.HashMap;
import java.util.*;
public class CountSubArraywithGivenSum {
    public static void main(String[] args) {
        int [] arr =new int[]{1,2,3};
        System.out.println(solve(arr,2));
    }

    /**
     * @param arr
     * @param X
     * @return
     */
    public static int solve(int []arr,int X){
        Map<Integer,Integer> freq = new HashMap<>();
        int count =0;
        int xorr =0;
        Arrays.sort(arr,(a,b) -> a-b);
        for(int i=0;i<arr.length;i++){
            xorr ^=arr[i];
            if(freq.get(xorr^X)!=null){
                count +=freq.get(xorr^X);
            }
            if(xorr==X) count++;
            if(freq.get(xorr)!=null) freq.put(xorr,freq.get(xorr)+1);
            else freq.put(xorr,1);

        }
        return count;
    }
    
}