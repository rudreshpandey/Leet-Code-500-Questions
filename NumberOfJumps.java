import java.util.Scanner;

public class NumberOfJumps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		int start=0,count=0,last=arr.length-1;
		int step = arr[start];
		
		System.out.println(minJumps(arr,start,last,count,step));
	}
	
	
	static int minJumps(int[] arr,int start,int last,int count,int step){
        int max=0;
        int initial=start;
        //System.out.println(start+" "+step+" "+max+" "+last);
        for(int i=step-1;i>=0;i--)
        {	if(initial>=last) break;
        	int value = arr[++initial]-i;
        	if(max<value)
        		max=value;
        }
        start = initial;
        step = max;
        count++;
        //System.out.println("2nd "+start+" "+step+" "+max+" "+last);
        if(step==0 && start!=last)
        	return -1;
        else if(start==last)
        	return count;
        else return minJumps(arr,start,last,count,step);
        	
        	
        
        
        
//        for(i=0;i<n;i++)
//        {
//            int temp=arr[i];
//            int max=0;
//            int index=0;
//            for(int j=i+1;j<=i+temp;j++)
//            {
//                int dif=j-i;
//                dif=temp-dif;
//                int value=arr[j]-dif;
//                if(max<value)
//                {
//                    max=value;
//                    index=j;
//                }
//                
//                System.out.println(dif+" "+value);
//                System.out.println("Max="+max+",j="+ j);
//            }
//            System.out.println("Max="+max+",j="+ j);
//            i=index-1;
//            count++;
//                
//        }
//        return count;
	}
	}
