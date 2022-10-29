package interview;

public class SearchElementInSortedMatrix {
//https://practice.geeksforgeeks.org/problems/search-in-a-matrix17201720/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-a-matrix
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
            for(int i=0,j=M-1;j>=0 && i<N;){
                if(mat[i][j]<X) i++;
                else if(mat[i][j]>X) j--;
                else return 1;
                
            }return 0;
        
    }

    public static long matSearch(int mat[][], int N, int M, int X,int m)
    {
        // your code here
            for(int i=0,j=M-1;j>=0 && i<N;){
                if(mat[i][j]<X) i++;
                else if(mat[i][j]>X) j--;
                else return 1;
                
            }return 0;
        
    }
    
}