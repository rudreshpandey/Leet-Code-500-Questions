package interview;

public class sortAnArray012 {
    public static void sort012(int a[], int n)
    {
        // code here 
        int zer_count=-1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                zer_count++;
                a[i]+=a[zer_count]-(a[zer_count]=a[i]);
            }
        }
        int one = zer_count;
        for(int i=one+1;i<n;i++){
            if(a[i]==1){
                one++;
                a[i]+=a[one]-(a[one]=a[i]);
                //j++;
            }
        }
    }
    
}