package interview;

public class InsertionSort {
    public void insertionSort(int arr[], int n)
  {
      //code here
      //https://www.geeksforgeeks.org/insertion-sort/
      for(int i=1;i<n;i++){
          int val = arr[i];
          for(int j=i-1;j>=0;j--){
              if(val<arr[j]){
                arr[j+1] = arr[j];
                arr[j] = val;
              }else{
                  //arr[j+1] = val;
                  break;
              }
              
          }
      }
  }
    
}