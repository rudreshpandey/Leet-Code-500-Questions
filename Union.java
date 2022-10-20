import java.util.*;

public class Union {

	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in); 
		n=sc.nextInt();
		m=sc.nextInt();
		int arr1[] = new int[n+m];
		//int arr2[] = new int[m];
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		sc.close();
		//rev_arr(arr);
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		System.out.println("Size=="+doUnion(arr1,n,arr2,m) );
		
		for
		
		
		

	}
	
	
	    public static int doUnion(int a[], int n, int b[], int m) 
	    {
	    	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	    	for(int i=0;i<n;i++)
	    	{
	    		hmap.put(a[i],1);
	    	}
	    	
	    	for(int i=0;i<m;i++)
	    	{
	    		hmap.put(b[i],1);
	    	}
	    	
	    	int arr[]= new int[n+m];
	    	int k=0;
	    	for(int i=0;i<n;i++)
	    	{
	    		if(hmap.get(a[i]) == 1)
	    		{
	    			arr[k++]=a[i];
	    			hmap.put(a[i], 0);
	    		}
	    		
	    	}
	    	
	    	for(int i=0;i<m;i++)
	    	{
	    		if(hmap.get(b[i]) == 1)
	    		{
	    			arr[k++]=b[i];
	    			hmap.put(b[i], 0);
	    		}
	    		
	    		//hmap.put(b[i],1);
	    	}
	    	
	    	return k;
	    	
	    }
	}

