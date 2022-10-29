package interview;

public class RecursiveInsertionSort {
    static int i = 1;
  static void insert(int arr[],int i)
  {
       // Your code here
  }
  //Function to sort the array using insertion sort algorithm.
  public static void insertionSort(int arr[], int n)
  {
      //code here
        
        if(i==n){
            i=1;
            return;
        }
        int val = arr[i];
        for(int j=i-1;j>=0;j--){
            if(val<arr[j]){
                arr[j+1] = arr[j];
                arr[j] = val;
            }else{
              //arr[j+1] = val;
              break;
            }
        }i++;
        insertionSort(arr,n);
  }
    
}