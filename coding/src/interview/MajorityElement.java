package interview;
import java.util.*;
public class MajorityElement {
    
    static int majorityElement(int a[], int size)
    {
        //Method-1
        
        int nby2 = size/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
            if(!map.containsKey(a[i])) map.put(a[i],1);
            else{
                int val = map.get(a[i]);
                map.put(a[i],val+1);
            }
        }
        //int result=-1;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()){
            if(pair.getValue()>nby2) return pair.getKey();
        }// return -1;

        //Method-2->Moore's Voting Algorithm
        int ele =-1;
        int count =0;
        for(int i=0;i<size;i++){
            if(count == 0){
                ele = a[i];
                count = 1;
            }
            else if(a[i]==ele) count++; 
            else count--;
        }
        count=0;
        for(int i=0;i<size;i++){
            if(ele == a[i]) count++;
        }
        if(count>size/2) return ele;
        return -1;
        
        
    }
}