public class NumberOccurenceOfX {
//https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-occurrence
    int count(int[] arr, int n, int x) {
        // code here
        int foc=-1;
        int loc=-1;
        int begin=0,end=n-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(arr[mid]<x) begin = mid+1;
            else if(arr[mid]>x) end = mid-1;
            else{
                loc=mid;
                begin = mid+1;
            }
        }
        begin=0;end=n-1;
        int count2=0;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(arr[mid]<x) begin = mid+1;
            else if(arr[mid]>x) end = mid-1;
            else{
                foc=mid;
                end = mid-1;
            }
        }
        if(foc<0) return 0;
        return loc-foc+1;
    }
    
}
