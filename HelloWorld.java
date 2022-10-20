import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
       // System.out.println("Hello, World!");
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-->0){
           int n = sc.nextInt();
           int x = sc.nextInt();
           int arr[] = new int[n];
           for(int i=0;i<n;i++) arr[i] = sc.nextInt();
           int count=-1;
           int index=0;
           int v=-1;
           int dp[]=new int[n];
           System.out.println(luke(arr,index,n,v,count,dp,x));
          }
    }
       public static int luke(int[]arr,int index,int n,int v,int count,int[]dp,int x){
    	   if(index==n) return count;
    	   System.out.println("index,value,v,count= "+index+" "+arr[index]+" "+v+" "+count);
    	   int data = arr[index];
    	   if(v==-1 || Math.abs(data-v)>x){
    		   int pos = data+x;
        	   int neg = data-x;
        	   return Math.min(luke(arr,index+1,n,pos,count+1,dp,x),luke(arr,index+1,n,neg,count+1,dp,x));
    	   }else return luke(arr,index+1,n,v,count,dp,x);
    	   
    	   
       }
     
    }

