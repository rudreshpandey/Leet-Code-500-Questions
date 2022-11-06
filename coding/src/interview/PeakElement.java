//https://practice.geeksforgeeks.org/problems/peak-element/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=peak-element
public class PeakElement {

    public int peakElement(int[] arr,int n)
    {
       //add code here.
       int begin=0;
       int end=n-1;
       while(begin<=end){
           int mid = begin+(end-begin)/2;
           if(mid==end) return end;
           if(arr[mid]<arr[mid+1]) begin = mid+1;
           else end=mid;
       }
       return end;
    }
    
}
