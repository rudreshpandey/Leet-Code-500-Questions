
public class MxMin {
	static class Pair{
		int min,max;
	}
	static Pair getMinMax(int [] arr,int low,int high) {
		Pair minmax=new Pair();
		Pair minmax1=new Pair();
		Pair minmax2=new Pair();
		System.out.println("low = "+low+" "+",high = "+high);
		if(low==high) {
			minmax.min=minmax.max=arr[low];
			return minmax;
		}
		if(low+1==high) {
			minmax.max=1+(minmax.min=arr[low]);
			return minmax;
		}
		int mid=(low+high)/2;
		minmax1=getMinMax(arr,low,mid);
		minmax2=getMinMax(arr,mid+1,high);
		int max=Math.max(minmax1.max,minmax2.max);
		int min=Math.min(minmax1.min,minmax2.min);
		minmax.max=max;
		minmax.min=min;
		return minmax;
		
		
	}
	public static void main(String args[]) {
		
        int arr[] = {1000, 12, 44, 0, 330, 30,800};
        int arr_size = 6;
        Pair minmax = getMinMax(arr, 0, arr_size-1);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);
        
        
        
    	
        

    }
	
	

}




