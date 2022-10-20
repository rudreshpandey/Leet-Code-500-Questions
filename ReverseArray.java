import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		rev_arr(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	
	public static void rev_arr(int arr[])
	{
		int start=-1,end=arr.length;
		while(++start<--end)
		{
			arr[start]+=arr[end];
			arr[end]=arr[start]-arr[end];
			arr[start]-=arr[end];
			
		}
	}
	
	
	
	
}
