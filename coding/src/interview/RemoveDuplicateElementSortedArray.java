package interview;

public class RemoveDuplicateElementSortedArray {
    int remove_duplicate(int A[],int N,int first){
        // code here
        if(N==1) return 1;
        int arr[] =A;
        int i=0,j=0;
        while(j<N){
            if(arr[j]>arr[i]){
                i++;
                arr[i]=arr[j];
                j++;
            }else if(arr[j]==arr[i]) j++;
        }
        return i+1;
    }
    
    int remove_duplicate(int A[],int N){
        // code here
        int duplicate_count =0;
        for(int i=1;i<N;i++){
            if(A[i]==A[i-1]) duplicate_count++;
            else A[i-duplicate_count]=A[i];
        } return N-duplicate_count;
    }
    
}