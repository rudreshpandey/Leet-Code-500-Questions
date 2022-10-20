import java.util.Scanner;

public class DuplicateElemntArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int k = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		
		System.out.println(findDuplicate(arr));
	}
	
public static int findDuplicate(int[] nums) {
        
        int xor=nums[0];
            int result=0;;
        for(int i=1;i<nums.length;i++)
        {
            int temp=xor;
            xor^=nums[i];
            System.out.println(xor+" "+temp+" "+nums[i]);
            if(xor==temp)
                result=nums[i];
            
        }
        return result;
        
    }

}
