package interview;

public class FindElementAppearOnceAmongOtherTwice {
    public static int search(int A[], int N)
    {
        int arr[] =A;
        if(N==1) return arr[0];
        int zor =arr[0];
        for(int i=1;i<N;i++){
             zor ^=arr[i];
        }
        return zor;
    }
    
}