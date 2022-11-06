package interview;
//https://practice.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-insert-position-of-k-in-a-sorted-array
public class SearchInsertPositionKInSortedArray {
    
    static int searchInsertK(int Arr[], int N, int k)
    {
        // code here
        int begin=0;
        int end=N-1;
        int []arr = Arr;
        int index=-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(arr[mid]<k) begin=mid+1;
            else if(arr[mid]>k){
              index = mid;
              end = mid-1;
            }else return mid;
        }
        if(index==-1) return N;
        return index;
    }
}