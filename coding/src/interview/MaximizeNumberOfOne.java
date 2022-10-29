package interview;

public class MaximizeNumberToOne {
    int findZeroes(int arr[], int n, int m) {
        // code here
        //Method-1
        int size =0;
        int flip =0;
        int zero_count=0;
        int i=0,j=0;
        for(j=0;j<n;j++){
            if(arr[j]==0) zero_count++;
            if(zero_count<=m) size =Math.max(size,j-i+1);
            else{
                while(i<n){
                    if(arr[i++]==0){
                       zero_count--;
                       break;
                    }
                }
            }
            
        }
        //return size;
        
        //Method-2
        int wr=0,wl=0,best_window=0;
        zero_count=0;
        while(wr<n){
            if(zero_count<=m){
                if(arr[wr]==0) zero_count++;
                wr++;
            }
            if(zero_count>m){
                if(arr[wl]==0)zero_count--;
                wl++;
            }
            if(wr-wl>best_window && zero_count<=m) best_window =wr-wl;
        }
        return best_window;
        
    }
    
}