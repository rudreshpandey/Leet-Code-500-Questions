package interview;

public class MinimumNumberOfJumps {
//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1
    static int minJumps(int[] arr){
        int total_jump = 0;
        if(arr.length==1) return 0;
        int last_position = 0;
        int jump =  arr[last_position];
        while(last_position+jump<arr.length){
            total_jump++;
            int next_jump = 0;
            int j = 0;
            for(int i=last_position+jump;i>last_position;i--){
                int val = arr[i]-j++;
                if(next_jump<val) next_jump = val;
            }
            if(next_jump==0) return -1;
            last_position += jump; 
            jump = next_jump;
            
        }
        if(last_position==arr.length-1) return total_jump;
        return total_jump+1;
        
    
    }
    
}