//package interview;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
    
    }

    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        // int i=0,j=0;
        // long []arr = new long[n+m];
        // int k=0;
        // while(i<n && j<m){
        //     if(arr1[i]<arr2[j]) arr[k++] = arr1[i++];
        //     else if(arr2[j]<arr1[i]) arr[k++]=arr2[j++];
        //     else{
        //         arr[k++] = arr1[i++];
        //         arr[k++]=arr2[j++];
        //     }
        // }
        // while(i<n) arr[k++] = arr1[i++];
        // while(j<m) arr[k++] = arr2[j++];
        // for(i=0;i<n;i++) arr1[i]=arr[i];
        // for(i=0;i<m;i++) arr2[i]=arr[n+i];
        
        //Method-2
        // int last = n-1;
        // for(int i=0;i<m;i++){
        //   int index = last+i;
        //   long val = arr2[i];
        //   for(int j=i-1;j>=0;j--,index--){
        //       if(arr2[j]>val){
        //           arr2[j+1] = arr2[j];
        //           arr2[j] = val;
        //       }else{
                  
        //           index=-1;
        //           break;
        //       }; 
        //   }
        //   for(int j=last;j>=0&& index>=0;j--,index--){
        //       if(arr1[j]>val){
        //           if(j+1==n) arr2[0] = arr1[j];
        //           else arr1[j+1] = arr1[j];
        //           arr1[j] = val;
        //       }else{
                  
        //           index=-1;
        //           break;
        //       }; 
        //   }
            
        // }
        
        //Method-3
        for(int gap=(int) Math.ceil(n+m / 2.0);gap>=1;gap=(int) Math.ceil(gap / 2.0)){
            int i=0,j=0;
            while(i+gap<n){
                if(arr1[i]>arr1[i+gap]){
                    arr1[i]+=arr1[i+gap]-(arr1[i+gap]=arr1[i]);
                }
                i++;
            }
            while(i<n && i+gap-n<m){
               if(arr1[i]>arr2[i+gap-n]){
                    arr1[i]+=arr2[i+gap-n]-(arr2[i+gap-n]=arr1[i]);
                }
                i++; 
            }
            while(i-n<m && i+gap-n<m){
               if(arr2[i-n]>arr2[i+gap-n]){
                    arr2[i-n]+=arr2[i+gap-n]-(arr2[i+gap-n]=arr2[i-n]);
                }
                i++; 
            }
            if(gap==1) gap=0;
        }
        
        //Method-4
        int gap =(int) Math.ceil(n + m/ 2.0);
        while (gap > 0) {
            int i = 0;
            int j = gap;
            while (j < (n + m)) {
              if (j < n && ar1[i] > ar1[j]) {
                swap(ar1[i], ar1[j]);
              } else if (j >= n && i < n && ar1[i] > ar2[j - n]) {
                swap(ar1[i], ar2[j - n]);
              } else if (j >= n && i >= n && ar2[i - n] > ar2[j - n]) {
                swap(ar2[i - n], ar2[j - n]);
              }
              j++;
              i++;
            }
            if (gap == 1) {
              gap = 0;
            } else {
              gap =(int) Math.ceil((double) gap / 2.0);
            }
        }
                
    }
    
}