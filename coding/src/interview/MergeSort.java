package interview;

public class MergeSort {

    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int n1 = m-l+1;
         int n2 = r-m;
         int arr1[] = new int[n1];
         int arr2[] = new int[n2];
         int  k=0;
         for(int i=l;i<=m;i++){
            arr1[k++] = arr[i]; 
         }
         k=0;
         for(int i=m+1;i<=r;i++){
            arr2[k++] = arr[i]; 
         }
         k=l;
         int i=0,j=0;
         for(;i<n1&&j<n2;){
             if(arr1[i]<=arr2[j]){
                 arr[k++]=arr1[i++];
             }else arr[k++]=arr2[j++]; 
         }
         while(i<n1) arr[k++]=arr1[i++];
         while(j<n2) arr[k++]=arr2[j++]; 
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l>=r) return;
        int m = l +(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    
}