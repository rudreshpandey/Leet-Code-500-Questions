import java.util.Scanner;

public class NextPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
	
		for(int i = 0; i <n ; i++) 
			arr1[i] = sc.nextInt();
		sc.close();
		nextPermutation(arr1);

	}
	
public static void nextPermutation(int[] nums) {
        
	int len = nums.length;
    int index=-1;
    for(int i=len-1;i>0;i--)
    {
        if(nums[i]>nums[i-1])
        {
           index=i-1;
           break;
        }
        
    }
    int last=len;
    if(index>=0)
    {
        int min=Integer.MAX_VALUE;
        int swapIndex=-1;
        for(int i=index+1;i<len;i++)
        {
            int temp = nums[i]-nums[index];
            if(temp>0 && min>=temp)
            {
                min = temp;
                swapIndex = i;
            }
        }
        nums[index]+=nums[swapIndex]-(nums[swapIndex]=nums[index]);
      
        int range=(len-index)/2+index;
           // System.out.println("range = "+range+" "+index+" "+last);
        for(int i=index+1;i<=range;i++)
            nums[i]+=nums[--last]-(nums[last]=nums[i]);
    }
    else
    {
        for(int i=0;i<len/2;i++)
            nums[i]+=nums[--last]-(nums[last]=nums[i]);
    }
    
    
    for(int i=0;i<len;i++)
    	System.out.print(nums[i]+" ");
        
        
        
    }

public   void nextPermutation_Good(int[] nums) {
    int dipIndx = getDipIndex(nums); // finding smallest element from backwards
    
    if(dipIndx == -1) {  // means array is sorted in descending order
        reverse(nums,0); 
        return;
    }
    
    int ceilIndx = getCeilIndex(nums,dipIndx); // find smaller value than dipElement
    if(ceilIndx != -1) swap(nums,ceilIndx,dipIndx); 
    reverse(nums,dipIndx+1);
    
    return;
}

public int getDipIndex(int[] arr){
    int idx = -1;
    for(int i=arr.length - 1;i > 0;i--){
        if(arr[i - 1] < arr[i]){
            idx = i-1;
            break;
        }
    }

    return idx;
}

public int getCeilIndex(int[] arr,int idx){
    int n = arr.length;
    int i = n - 1;
    while(arr[idx] >= arr[i]){
        i--;
    }
    return i;
}

public void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]=temp;
}

public void reverse(int[] arr,int idx){
    int n = arr.length;
    int h = n-1;
    while(idx < h){
        swap(arr,idx,h);
        h--;
        idx++;
    }
}

}
