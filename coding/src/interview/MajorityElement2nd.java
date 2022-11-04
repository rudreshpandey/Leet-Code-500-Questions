package interview;
import java.util.*;
public class MajorityElement2nd {

    public static ArrayList<Integer> Solve(int n, int[] nums) {
        // code here
        int ele1 =-1,ele2=-1,count1=0,count2=0;
        int []a = nums;
        int size = n;
        //int count =0;
        for(int i=0;i<n;i++){
            if(count1 == 0){
                ele1 = a[i];
                count1=1;
                
            }
            else if(a[i]==ele1) count1++; 
            else if(count2==0){
                ele2 = a[i];
                count2=1;
            }
            else if(a[i]==ele2) count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1=0;count2=0;
        for(int i=0;i<size;i++){
            if(ele1 == a[i]) count1++;
            if(ele2 == a[i]) count2++;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(count1>size/3) list.add(ele1);
        if(count2>size/3) list.add(ele2);
        if(list.isEmpty()){
            list.add(-1);
            return list;
        }
        else return list;
        //return -1;
    }
    
}