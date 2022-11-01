package interview;

public class StockBuyAndSell {
    //https://practice.geeksforgeeks.org/problems/stock-buy-and-sell2615/0?company[]=Intuit+&page=1&query=company[]Intuit+page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=stock-buy-and-sell
    public void stockBuySell(int[] price, int n) {
        // code here
        int arr[] =price;
        int b=-1,s=-1;
        boolean flag =true;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1] && b==-1) b=i;
            else if(arr[i]<arr[i+1] && b!=-1) continue;
            else if(arr[i]>=arr[i+1] && b==-1) continue;
            else{
                s=i;
                System.out.print("("+b+" "+s+") ");
                flag =false;
                b=-1;
            }
        }
        if(b!=-1){
             System.out.print("("+b+" "+(n-1)+") ");
             flag =false;
        }
        if(flag)System.out.println("No Profit");
        else System.out.println();
        
    }
    
}