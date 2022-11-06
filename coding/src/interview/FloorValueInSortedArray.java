package interview;
//https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%3BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
public class FloorValueInSortedArray {
    static int findFloor(long arr[], int n, long x)
    {
        int begin =0,end=n-1;
        long large = Long.MIN_VALUE;
        int index =-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(arr[mid]>x){
                end = mid-1;
            }
            else{
               // if(large<arr[mid]){
                    large = arr[mid];
                    index = mid;
                //}
                begin = mid+1;
                
            }
        }
        return index;
    }
    
}