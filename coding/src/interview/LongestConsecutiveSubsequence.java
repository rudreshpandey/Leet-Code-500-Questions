package interview;
import java.util.*;
public class LongestConsecutiveSubsequence {

    static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Set<Integer> set = new TreeSet<>();
	   for(int i=0;i<N;i++) set.add(arr[i]);
	   int max = Integer.MIN_VALUE;
	   Iterator<Integer> it = set.iterator();
	   int last = it.next();
	   int count = 1;
	   while(it.hasNext()){
	       int val = it.next();
	       if(val-1==last){
	         count++;   
	       }
	       else{
	           max = Math.max(max,count);
	           count=1;
	       }
	       last = val;
	   }
	   max = Math.max(max,count);
	   return max;
	}
    
}