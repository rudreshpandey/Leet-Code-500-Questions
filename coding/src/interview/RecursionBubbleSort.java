package interview;

public class RecursionBubbleSort {
    public static void bubbleSort(int arr[], int n)
    {   
        // for(int i=0;i<n;i++){
        if(n==1) return;
        boolean isSort = true;
        for(int j=1;j<n;j++){
            if(arr[j]<arr[j-1]){
                arr[j]+=arr[j-1]-(arr[j-1]=arr[j]);
                isSort = false;
            }
        }
        if(isSort) return;
        bubbleSort(arr,n-1);
        
        
    }
    
}