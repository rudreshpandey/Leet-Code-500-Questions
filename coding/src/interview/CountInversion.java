package interview;
//https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=inversion-of-array
public class CountInversion {
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        //Insertion Sort;
        // long val = arr[0];
        // long count=0;
        // for(int i=1;i<N;i++){
        //     val =  arr[i];
        //     for(int j=i-1;j>=0;j--){
        //         if(val<arr[j]){
        //             arr[j+1] = arr[j];
        //             arr[j] = val;
        //             count++;
        //         }else break;
        //     }
        // }
        // return count;
        
        return mergeSort(arr,0,(int)N-1);
    }
    //Method-2nd->MergeSort
    static long mergeSort(long[] arr,int begin,int end){
        if(begin>=end) return 0;
        int mid = begin +(end-begin)/2;
        long count1 = mergeSort(arr,begin,mid);
        long count2 = mergeSort(arr,mid+1,end);
        return merge(arr,begin,mid,end)+count1+count2;
    }
    
    static long merge(long[] arr,int begin,int mid,int end){
        long arr1[] = new long[mid-begin+1];
        long arr2[] = new long[end-mid];
        for(int i=0;i<mid-begin+1;i++) arr1[i] = arr[i+begin];
        for(int i=0;i<end-mid;i++) arr2[i] = arr[i+mid+1];
        int i=0;
        int j=0;
        int n = mid-begin+1;
        int k=begin;
        int m = end-mid;
        long inversion=0;
        while(i<n && j<m){
            if(arr1[i]>arr2[j]){
                inversion += (long)(n-i);
                arr[k++]=arr2[j++];
            }else{
                arr[k++]=arr1[i++];
            }
        }
        while(i<n) arr[k++]=arr1[i++];
        while(j<m) arr[k++]=arr2[j++];
        return inversion;
    }
    
}