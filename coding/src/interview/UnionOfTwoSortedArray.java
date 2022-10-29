package interview;
import java.util.*;
public class UnionOfTwoSortedArray {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> list =new ArrayList<Integer>();
        int i=0,j=0;
        int index=-1;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(!list.isEmpty() && list.get(index)==arr1[i]) i++;
                else{
                    list.add(arr1[i]);
                    i++;
                    index++;
                }
            }else if(arr1[i]>arr2[j]){
                if(!list.isEmpty() && list.get(index)==arr2[j]) j++;
                else{
                   list.add(arr2[j]);
                   j++;
                   index++;
               }
            }
            else{
                if(!list.isEmpty() && list.get(index)==arr2[j]){
                    j++;i++;
                }else{
                    list.add(arr2[j]);
                    i++;j++;index++;
                }
           }
        }
        while(i<n){
                if(!list.isEmpty() && list.get(index)==arr1[i]) i++;
                else{
                    list.add(arr1[i]);
                    i++;
                    index++;
                }
        }
        while(j<m){
                if(!list.isEmpty() && list.get(index)==arr2[j]) j++;
                else{
                    list.add(arr2[j]);
                    j++;
                    index++;
                }
        }
        return list;
    }
    
}