package interview;
import java.util.*;
public class FindFourSumNumber {
//https://practice.geeksforgeeks.org/problems/find-all-four-sum-numbers1732/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-four-sum-numbers
    public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        Arrays.sort(arr);
        int n= arr.length;
        int a;
        ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
        for(int i=0;i<n;){
            for(int j=i+1;j<n;){
                int m = j+1;
                int l = n-1;
                while(m<l){
                    int sum = arr[i]+arr[j]+arr[m]+arr[l];
                    if(sum<k) m++;
                    else if(sum>k) l--;
                    else{
                      ArrayList<Integer> list  = new ArrayList<Integer>();
                      list.add(arr[i]);
                      list.add(arr[j]);
                      list.add(arr[m]);
                      list.add(arr[l]);
                      bigList.add(list);
                      a = arr[m];
                      while(m<l && a==arr[m]) m++;
                      a = arr[l];
                      while(m<l && a==arr[l]) l--;
                    }
                    
                }
                a = arr[j];
                while(j<n && a==arr[j]) j++;
            }
            a = arr[i];
            while(i<n && a==arr[i]) i++;
        }
        return bigList;
}
    
}