import java.util.Scanner;


public class CyclicRotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) 
			arr[i] = sc.nextInt();
		int k = sc.nextInt();
		
		rotateArray(arr, n, k);
		printArray(arr, n);
	}
	
	
	public static void rotateArray(int[] arr, int n, int k) {
		
		int temp = n, i = 0, j = 0;
		
		int test1=arr[0];
		while(temp >= 1) {
			
			int test = test1;
			i = (i + k) % n;
			test1 = arr[i];
			arr[i] = test;
			temp--;
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
