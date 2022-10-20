import java.util.Scanner;

public class Sort0123 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		sort012(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void sort012(int a[], int n)
    {
        int l=0,m=0,h=n-1;
        while(m<=h)
        {
            if(a[m]==0) 
            {
                int temp = a[l];
				a[l++] = a[m];
				a[m++] = temp;
            }
            else if(a[m]==1) m++;
            else if(a[m]==2)
            {
                int temp = a[h];
				a[h--] = a[m];
				a[m] = temp;
            }
        } 
    }

}
