package interview;

public class SelectionSort {
	public static void main(String[] args) {
		int gap =(int) Math.ceil((double)(n + m) / 2.0);
		System.out.println(gap);
	}

    //https://www.geeksforgeeks.org/selection-sort/
    void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n;i++){
	        int min = arr[i];
	        int index = i;
	        for(int j=i+1;j<n;j++){
	            if(arr[j]<min){
	                min = arr[j];
	                index = j;
	            }
	       }arr[i] += arr[index]-(arr[index]=arr[i]);
	    } 
	    
	}
    
}