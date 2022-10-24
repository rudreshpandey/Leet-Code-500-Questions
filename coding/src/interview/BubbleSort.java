package interview;

public class BubbleSort {
    public static void bubbleSort(int arr[], int n)
    { 
        //https://www.geeksforgeeks.org/bubble-sort/ 
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]) arr[j]+=arr[j-1]-(arr[j-1]=arr[j]);
            }
        }
        //code here
    }
    
}