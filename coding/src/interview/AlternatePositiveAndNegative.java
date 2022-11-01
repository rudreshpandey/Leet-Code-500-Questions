package interview;

public class AlternatePositiveAndNegative {
    void rearrange(int arr[], int n) {
        // code here
        //Method-1
        // List<Integer> pos,neg;
        // pos = new ArrayList<Integer>();
        // neg = new ArrayList<Integer>();
        // for(int i=0;i<n;i++){
        //     if(arr[i]>=0) pos.add(arr[i]);
        //     else neg.add(arr[i]);
        // }
        // int pos_size = pos.size();
        // int neg_size = neg.size();
        // int i=0,j=0,k=0;
        // //System.out.println(pos+" "+neg);
        // while(i<pos_size && j<neg_size){
        //     arr[k++] = pos.get(i++);
        //     arr[k++] = neg.get(j++);
        // }
        // while(i<pos_size) arr[k++] = pos.get(i++);
        // while(j<neg_size) arr[k++] = neg.get(j++);
        
        //Method-2
        int wrong_index =-1;
        for(int i=0;i<n;i++){
            if(wrong_index!=-1){
                if((arr[wrong_index]>=0 && arr[i]<0)||(arr[wrong_index]<0 && arr[i]>=0)){
                    rotate(arr,wrong_index,i);
                    if(i-wrong_index>1) wrong_index+=2;
                    else wrong_index =-1;
                }
                
            }else{
                if((arr[i]>=0 && i%2==1)|| (arr[i]<0 && i%2==0)) wrong_index =i;
            }
        }
        
        
        
    }
    
    void rotate(int arr[],int from,int to){
            int temp = arr[to];
            int i = to;
            while(i>from){
                arr[i] =arr[i-1];
                i--;
            }
            arr[from] = temp;
        }
    
}