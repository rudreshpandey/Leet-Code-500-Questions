import java.util.Scanner;

public class MergeTwoSortArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i = 0; i <n ; i++) 
			arr1[i] = sc.nextInt();
		
		for(int i = 0; i <m ; i++) 
			arr2[i] = sc.nextInt();
		
		merge(arr1,arr2,n,m);
		
		for(int i = 0; i <n ; i++)
			System.out.print(arr1[i]+" ");
		System.out.println();
			
		for(int i = 0; i <m ; i++) 
			System.out.print(arr2[i]+" ");
		
		

	}
	
	
public static void  merge(int arr1[], int arr2[], int n, int m) {
        
        
        for(int i=0;i<n;i++)
        {
            int j=0;
           if(arr1[i]>arr2[j])
           {
               int temp=arr1[i];
               arr1[i]=arr2[j];
               while(j<m-1)
               {
                   if(arr2[j+1]<=temp)
                   {
                       arr2[j]=arr2[j+1];
                       j++;
                   }
                   else
                   {
                       arr2[j]=temp;
                       break;
                   }
               }
               if(j==m-1)
               arr2[j]=temp;
               
           }
           
        }
        
    }

}
