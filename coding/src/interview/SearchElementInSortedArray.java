package interview;

public class SearchElementInSortedArray {
    static int searchInSorted(int arr[], int N, int K)
    {
        int low=0,high=N-1,k=K;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(arr[mid]<k) low=mid+1;
            else if(arr[mid]>k) high=mid-1;
            else return 1;
        }
        return -1;
    }
    
}