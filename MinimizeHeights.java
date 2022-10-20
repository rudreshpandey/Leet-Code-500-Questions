import java.util.Scanner;

public class MinimizeHeights {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		//int k = sc.nextInt();
		System.out.println(getMinDiff(arr,n,k));

	}
public static int getMinDiff(int arr[], int n, int k) {
        
        int max,min;
        int j;
        if(n%2==0)
        {
            if(arr[0]<arr[1])
            {
                max=arr[1];
                min=arr[0];
            }
            else
            {
                max=arr[0];
                min=arr[1];
            }
            j=2;
        }
        else
        {
            max=min=arr[0];
            j=1;
        }
        for(int i=j;i<n-1;i+=2)
        {
            if(arr[i]<arr[i+1])
            {
                if(min>arr[i])
                min=arr[i];
                
                if(arr[i+1]>max)
                max=arr[i+1];
            }
            else
            {
                if(min>arr[i+1])
                min=arr[i+1];
                
                if(arr[i]>max)
                max=arr[i];
            }
        }
        System.out.println(max+" "+min);
        int dif=max-min;
        System.out.println(dif);
        int max1=max-k-min;
        if(dif>max1)
        dif=max1;
        System.out.println(dif);
        int min1=max-(min+k);
        if(dif>min1)
        dif=min1;
        System.out.println(dif);
        int dif1=max-k-min-k;
        if(dif>dif1)
        dif=dif1;
        return dif;
        // code here

}
}
