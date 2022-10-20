import java.util.*;

public class MergeInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr1 = new int[n][2];
		for(int i = 0; i <n ; i++) 
		{
			arr1[i][0] = sc.nextInt();
			arr1[i][1] = sc.nextInt();
		}
		sc.close();
		
		merge(arr1);
		System.out.println("YES");
	}
	
	    public static void merge(int[][] intervals) {
	        
    	Arrays.sort(intervals, (a,b) -> a[0] - b[0]);	
    	int[] newInterval = intervals[0];
    	newInterval[0]=intervals[0][0];
    	newInterval[1]=intervals[0][1];
        int index=0;
    	
    	int len=intervals.length;
    	
    	for(int i=1;i<len;i++)
    	{
            
    		if(newInterval[1]>=intervals[i][0])
    		{
    			newInterval[1]=Math.max(newInterval[1],intervals[i][1]);

    		}
    		else
    		{
                intervals[index++]=newInterval;
                newInterval = intervals[i];
            }
    	}
    	
    	intervals[index++]=newInterval;
        int [][] arr =new int[index][2];
        
        for(int k=0;k<index;k++)
        {
            arr[k]=intervals[k];
        }

        for(int k=0;k<index;k++)
        {
            System.out.println(arr[k][0]+" "+arr[k][1]);
        }
	    	   
	    }
        
}



