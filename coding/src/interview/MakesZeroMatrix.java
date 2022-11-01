package interview;

import java.util.Scanner;

public class MakesZeroMatrix {
    //https://practice.geeksforgeeks.org/problems/make-zeroes4042/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=make-zeroes
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] =sc.nextInt();
            }
        }sc.close();
        MakeZeros(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }

    }
    public static void  MakeZeros(int[][] matrix)

    {int n = matrix.length;

       int m = matrix[0].length;

       int visited[][] = new int[n][m];

       for(int i=0; i<n; i++){

           

           for(int j=0; j<m; j++){

               int sum = 0;

               if(matrix[i][j] == 0){

                   if(i-1 >= 0){

                       sum += matrix[i-1][j];

                       visited[i-1][j] = -1;

                   }

                   if(i+1 < n){

                       sum += matrix[i+1][j];

                       visited[i+1][j] = -1;

                   }

                   if(j-1 >= 0){

                       sum += matrix[i][j-1];

                       visited[i][j-1] = -1;

                   }

                   if(j+1 < m){

                       sum += matrix[i][j+1];

                       visited[i][j+1] = -1;

                   }

                   visited[i][j] = sum;

               }

           }

       }

       for(int i=0; i<n; i++){

           for(int j=0; j<m; j++){

               if(visited[i][j] == -1){

                   matrix[i][j] = 0;

               }

               if(visited[i][j] > 0){

                   matrix[i][j] = visited[i][j];

               }

           }

       }

}
    
}