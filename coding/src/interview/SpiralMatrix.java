package interview;

public class SpiralMatrix {

    public int findK(int a[][], int n, int m, int k)
	{
	    // Your code goes here
	    int count=1;
	    int [][]arr = a;
	    int st=0;
	    while(true){
	       for(int j=st;j<m-st;j++){
	            if(count<k){
	                //System.out.println(arr[st][j]);
	                count++;
	            }
	            else return arr[st][j];
	       }
	       //count--;
	       for(int i=st+1;i<n-1-st;i++){
	            if(count<k){
	                //System.out.println(arr[i][m-1-st]);
	                count++;
	            }
	            else return arr[i][m-1-st];
	       }
	       //count--;
	       for(int i=m-1-st;i>=0+st;i--){
	            if(count<k){
	                //System.out.println(arr[n-1-st][i]);
	                count++;
	            }
	            else return arr[n-1-st][i];
	       }
	       for(int i=n-1-st-1;i>=1+st;i--){
	            if(count<k){
	                //System.out.println(arr[i][st]);
	                count++;
	            }
	            else return arr[i][st];
	       }
	       st++;
	       if(count>n*m) return -1;
	       
	    }
	    
	}
    
}