package interview;

public class LeftRotateArray {

    void leftRotate(long arr[], int k,int n)
    {
        k %= n;
        for(int i=0;i<k/2;i++) arr[i]+=arr[k-1-i]-(arr[k-1-i]=arr[i]);
        for(int j=0,i=k;i<k+(n-k)/2;i++,j++) arr[i]+=arr[n-1-j]-(arr[n-1-j]=arr[i]);
        for(int i=0;i<n/2;i++) arr[i]+=arr[n-1-i]-(arr[n-1-i]=arr[i]);
    }
    
}