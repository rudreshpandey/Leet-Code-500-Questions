package interview;
import java.util.*;
public class LeadersAnArray {

    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(n==1){
            
            return list;
        }
        list.add(arr[n-1]);
        int max =arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(max<=arr[i]){
                max = arr[i];
                list.add(arr[i]);
            }
        }
        Collections.sort(list,Collections.reverseOrder());
        return list;
        
    }
    
}