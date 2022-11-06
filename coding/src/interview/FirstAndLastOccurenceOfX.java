import java.util.*;
//https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=first-and-last-occurrences-of-x
public class FirstAndLastOccurenceOfX {
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        
        int begin=0;
        int end=n-1;
        int first=-1;
        int last=-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(arr[mid]<x) begin=mid+1;
            else if(arr[mid]>x) end=mid-1;
            else{
                first=mid;
                end = mid-1;
            }
        }
        begin=0;end=n-1;
        while(begin<=end){
            int mid = begin+(end-begin)/2;
            if(arr[mid]<x) begin=mid+1;
            else if(arr[mid]>x) end=mid-1;
            else{
                last = mid;
                begin = mid+1;
                
            }
        }
        ArrayList<Long> list = new ArrayList<>();
        list.add((long)first);
        list.add((long)last);
        return list;
    }
}
