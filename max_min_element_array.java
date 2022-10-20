import java.util.Scanner;

public class max_min_element_array {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		max_min_general(arr);
		max_min_efficient(arr);
		sc.close();
		
	}
	public static void max_min_general(int arr[])
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			
		}
		System.out.println("MAX:"+max+"\nMIN:"+min);
		
	}
	
	public static void max_min_efficient(int arr[])
	{
		int n=arr.length;
		int max,min,start,end=n-1;
		if(n%2 == 0)
		{
			if(arr[0]>arr[1])
			{
				max = arr[0];
				min = arr[1];
			}
			else
			{
				max = arr[1];
				min = arr[0];
			}
			start = 2;
		}
		else
		{
			max = min = arr[0];
			start = 1;
		}
		
		for(int i=start;i<end;i+=2)
		{
			if(arr[i]>arr[i+1])
			{
				if(arr[i]>max)
					max = arr[i];
				if(arr[i+1]<min)
					min = arr[i+1];
			}
			else
			{
				if(arr[i+1]>max)
					max = arr[i+1];
				if(arr[i]<min)
					min = arr[i];
				
			}
		}
		System.out.println("MAX:"+max+"\nMIN:"+min);
	}
	

}
