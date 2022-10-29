package interview;

public class QuickSort {
    //Best and Average = order of nlogn-> choose pivot by random choose
    //worst case order of n*n
    //https://practice.geeksforgeeks.org/problems/quick-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=quick-sort

    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low>=high) return;
        int pivot = partition(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot_value = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<=high && arr[i]<=pivot_value)i++;
            while(j> low && arr[j]>pivot_value)j--;
            if(i<j) arr[i]+=arr[j]-(arr[j]=arr[i]);
        }
        arr[low]+=arr[j]-(arr[j]=arr[low]);
        return j;
        
        
    } 
    
}