import interviw;
import java.util.*;
public class OverLappingInterval {
//https://practice.geeksforgeeks.org/problems/8a644e94faaa94968d8665ba9e0a80d1ae3e0a2d/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=overlapping_intervals
    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here // Code here
        
         int k=0;

 

    int count=0;

 int [][] intervals = Intervals;

    Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));

 

    int[][]ans=new int[intervals.length][intervals[0].length];

 

    for(int i=0;i<intervals.length-1;i++){

    if(intervals[i+1][0]<=intervals[i][1]&&intervals[i+1][1]>=intervals[i][1]){

      intervals[i+1][0]=intervals[i][0];

    }

    else if(intervals[i+1][0]<=intervals[i][1]&&intervals[i+1][1]<intervals[i][1]){

      intervals[i+1][0]=intervals[i][0];

      intervals[i+1][1]=intervals[i][1];

    }

    else{

      count++;

      ans[k][0]=intervals[i][0];

      ans[k++][1]=intervals[i][1];

    }

    }

    count++;

    ans[k][0]=intervals[intervals.length-1][0];//for including the last interval

    ans[k++][1]=intervals[intervals.length-1][1];

 

 

    ans=Arrays.copyOf(ans,count);

    return ans;
    }
    
}