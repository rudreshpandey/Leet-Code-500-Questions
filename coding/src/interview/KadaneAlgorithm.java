package interview;

public class KadaneAlgorithm {
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        //Method-1
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum +=arr[j];
                if(sum>max) max =sum;
            }
        }//return max;
        //Method-2
        int sum=0;
        for(int i=0;i<n;i++){
            if(sum<0) sum=arr[i];
            else sum +=arr[i];
            max =Math.max(max,sum);
        }
        return max;
        
    }
    
}