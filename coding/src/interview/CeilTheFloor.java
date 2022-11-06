package interview;
//https://practice.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
public class CeilTheFloor {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        int begin = -1,end=n-1;
        int floor=Integer.MIN_VALUE,ceil=Integer.MAX_VALUE;
        while(++begin<=end){
            if(arr[begin]<x && floor<arr[begin]) floor =arr[begin];
            else if(arr[begin]>x && ceil>arr[begin]) ceil = arr[begin];
            else if(arr[begin]==x)return new Pair(x,x);
            
        }
        if(floor==Integer.MIN_VALUE) floor=-1;
        if(ceil==Integer.MAX_VALUE) ceil=-1;
        return new Pair(floor,ceil);
    
}