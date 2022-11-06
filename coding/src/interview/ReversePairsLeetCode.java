//package interview;

//https://leetcode.com/problems/reverse-pairs/description/
public class ReversePairsLeetCode {

    public int reversePairs(int[] nums) {
        int count=0;
        int []arr =nums;
        int n= arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         long val = (long)2*arr[j];
        //         if(arr[i]>val) count++;
        //     }
        // }
        //Method 2nd
        count = mergeSort(arr,0,n-1);
        return count;
    }

    int mergeSort(int[]arr,int begin,int end){
        if(begin>=end) return 0;
        int mid = begin +(end-begin)/2;
        int count1 = mergeSort(arr,begin,mid);
        int count2 = mergeSort(arr,mid+1,end);
        return merge(arr,begin,mid,end)+count1+count2;
    }

    int merge(int[] arr,int begin,int mid,int end){
        
        int n = mid-begin+1;
        int m = end-mid;
        int s =mid+1;
        int count = 0;
        for(int i=begin;i<=mid;i++){
            while(s<=end && arr[i]>2*(long)arr[s]) s++;
            count += (s-mid-1);
        }
        
        int arr1[] = new int[n];
        int arr2[] = new int[m];
        for(int i=0;i<n;i++) arr1[i] = arr[begin+i];
        for(int i=0;i<m;i++) arr2[i] = arr[mid+1+i];
        int i=0,j=0,k=begin;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]) arr[k++]=arr1[i++];
            else arr[k++] = arr2[j++];
        }
        while(i<n) arr[k++]=arr1[i++];
        while(j<m) arr[k++]=arr2[j++];
        return count;
    }
    
}