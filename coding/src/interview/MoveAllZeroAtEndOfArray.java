package interview;

public class MoveAllZeroAtEndOfArray {

    void pushZerosToEnd(int[] arr, int n) {
        // code here
        for(int i=0,j=0;j<n;j++){
            if(arr[j]!=0){
                arr[i]+=arr[j]-(arr[j]=arr[i]);
                i++;
            }
        }
    }
    
}