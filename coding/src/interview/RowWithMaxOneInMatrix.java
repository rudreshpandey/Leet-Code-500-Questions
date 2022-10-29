package interview;

public class RowWithMaxOneInMatrix {
    //https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s
    int rowWithMax1s(int arr[][], int n, int m) {
        int f_row =-1;
        for(int i=0;i<n;i++){
            if(arr[i][m-1]==1){
                f_row =i;
                break;
            }
        }
        if(f_row==-1) return -1;
        int max_col =m-1;
        for(int i=m-1;i>=0;i--){
            if(arr[f_row][i]==1){
                max_col--; 
            }else break;
        }
        if(max_col<0) return f_row;
        int i =f_row+1;
        int row =f_row;
        
        while(i<n && max_col>=0){
            if(arr[i][max_col]==1){
                max_col--;
                row =i;
            }else i++;
            
        } 
        return row;
        // code here
    }
    
}