package interview;

public class FrequencyOfLimitedRangeArray {
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    
    {
        for(int i=0;i<N;){
            int val = arr[i];
            if(val>N){
                arr[i] = 0;
                i++;
            }else if(val<1){
                i++;
            }else if(arr[val-1]<0){
                arr[val-1] += -1;
                arr[i] = 0;
            }else{
                arr[i] = arr[val-1]; 
                arr[val-1] = -1; 
            }   
        }
        for(int i =0;i<N;i++) if(arr[i]<0) arr[i]=-arr[i];
    }
    
}