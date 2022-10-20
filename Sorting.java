import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		
		SelectionSort(arr,n);
		
		BubbleSort(arr,n);
		
		InsertionSort(arr,n);
		
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	private static void SelectionSort(int arr1[],int n)
	{
		int arr[]=arr1.clone();
		for(int i=0;i<n;i++)
		{
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<n;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
					index=j;
				}
			}
			arr[i]+=arr[index]-(arr[index]=arr[i]);
			
		}
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void BubbleSort(int arr1[],int n)
	{
		int arr[]=arr1.clone();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
					arr[j]+=arr[j+1]-(arr[j+1]=arr[j]);
			}
		}
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	private static void InsertionSort(int arr1[],int n)
	{
		int arr[]=arr1.clone();
		for(int i=1;i<n;i++)
		{
			for(int j=i-1;j>=0;j--)
			{
				if(arr[j]<arr[j+1]) continue;
				else
				{
					arr[j]+=arr[j+1]-(arr[j+1]=arr[j]);
				}
			}
		}
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

public class Ram{
	
}


