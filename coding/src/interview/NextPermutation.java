package interview;
import java.util.*;
public class NextPermutation {
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        //int k=-1;
        //int begin=N-1;
        int end =N-1;;
        for(int i=N-1;i>0;i--){
            if(arr[i]<=arr[i-1]) continue;
            else{
                int k=i-1;
                while(end>k){
                    if(arr[end]<=arr[k]) end--;
                    else break;
                }
                arr[k]+=arr[end]-(arr[end]=arr[k]);
                Arrays.sort(arr,i,N);
                end=0;
                break;
            }
        }
        if(end!=0) Arrays.sort(arr,0,N);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            list.add(arr[i]);
        }
        return list;
        
    }
    
}