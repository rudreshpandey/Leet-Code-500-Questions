package interview;
import java.util.*;
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class FindAllPairWithGivenSum {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        for(int i=0;i<M;i++) B[i] =-B[i];
        Arrays.sort(B);
        for(int i=0;i<M;i++) B[i] = -B[i];
        List<Long> list1,list2;
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        for(int i=0,j=0;i<N && j<M;){
            long sum = A[i]+B[j];
            if(sum==X){
                list1.add(A[i]);
                list2.add(B[j]);
                i++;j++;
            }else if(sum<X) i++;
            else j++;
        }
        int sz = list1.size();
        pair[] arr = new pair[sz];
        for(int i=0;i<sz;i++) arr[i] = new pair(list1.get(i),list2.get(i));
        return arr;   
    }
}