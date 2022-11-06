package interview;

public class FindMissingAndRepeatingNumber {
//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-missing-and-repeating
    int[] findTwoElement(int arr[], int n) {
        // code here
        //Mthod->count frquency in N Number
        for(int i=0;i<n;){
           int val = arr[i];
           if(val<1) i++;
           else if(arr[val-1]>0){
               arr[i] = arr[val-1];
               arr[val-1] = -1;
           }else{
               arr[val-1]--;
               arr[i] =0;
               i++;
           }
        }
        int twice=0,miss=0;
        for(int i=0;i<n;i++){
            if(arr[i]<-1) twice = i+1;
            if(arr[i]>=0) miss = i+1;
        }
        //System.out.println(Arrays.toString(arr));
        int nSum = n*(n+1)/2;
        int two [] = new int[]{twice,miss};
        return two;
        
        //Method -2 and clean
        int repeating = -1;
        for(int i=0;i<n;i++){
            int value = Math.abs(arr[i])-1;
            if(arr[value]<0) repeating = value+1;
            else arr[value] = - arr[value];
        }
        int missing = -1;
        for(int i=0;i<n;i++) if(arr[i]>0) missing = i+1;
        int arrNew[] = new int[2];
        arrNew[0] = repeating;
        arrNew[1] = missing;
        return arrNew;
         
    }
    
}