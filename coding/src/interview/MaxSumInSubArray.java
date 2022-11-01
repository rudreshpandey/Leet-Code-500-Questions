package interview;
public class MaxSumInSubArray {
    public static long pairWithMaxSum(long arr[], long N)
    {
        //https://practice.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category=&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays
        // Your code goes here
        //Method-1
        // long max = Long.MIN_VALUE;
       
        // for(int i=0;i<N;i++){
        //     long f=Long.MIN_VALUE,s=Long.MIN_VALUE;
             
        //     for(int j=i;j<N;j++){
        //         if(j==i){
        //              f = arr[j];
        //              max = Math.max(f,max);
        //         }
        //         else if(j==i+1){
        //             s = Math.max(f,arr[j]);
        //             f = Math.min(f,arr[j]);
        //             max = Math.max(f+s,max);
                    
        //         }else{
        //             if(f>arr[j]){
        //                 s=f;
        //                 f=arr[j];
        //             }else if(s>arr[j]) s=arr[j];
        //             max = Math.max(f+s,max);
                    
        //         }
        //     }
            
        // }
        // return max;
        
        //Method-2
        long f = Math.min(arr[0],arr[1]);
        long s = Math.max(arr[0],arr[1]);
        long max = f+s;
        long sum =max;
        for(int j=2;j<N;j++){
            sum= arr[j] + arr[j-1];
            max= Math.max(sum,max);
        } return max;
        
    }
    
}