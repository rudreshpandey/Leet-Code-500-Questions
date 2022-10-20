package Interview;
import java.util.*;

public class Maximum {
	int minEle;
	Node node = new Node();
    Stack<Integer> s =  new Stack<>();
	public static void main(String[] args) {
		
		Maximum maximum = new Maximum();
//		B bc = new B();
//	      int b = bc.height;
	      
	      child ac = new child();
	     // int a = ac.height;
	      System.out.println(ac.height+" ");
		byte p =0;
		p=1;
		System.out.println("p= "+p);
		maximum.push(2);
		maximum.push(1);
		maximum.push(5);
		maximum.push(6);
		maximum.push(8);
		maximum.push(3);
		maximum.push(7);
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		System.out.println(maximum.getMax());
		System.out.println(maximum.popMax());
		

	}


    int getMin()
    { if(s.isEmpty()) return -1;
    	return minEle;
    }
    
    int pop()
    {
    	if(s.isEmpty()) return -1;
	    int top = s.pop();
	    if(top>= minEle) return top;
	    minEle = 2*minEle - top;
	    return (top+minEle)/2;
    }

    void pusht(int x)
    {
	 if(s.isEmpty()) {
		 s.push(x);
		 minEle=x;
	 }
	 else if(x>=minEle) s.push(x);
	 else {
		 int temp = 2*x-minEle;
		 minEle = x;
		 s.push(temp);
	 }
    }
    int maxEle;
    Stack<Integer> stmax = new Stack<>();
    
    int getMax() {
    	if(stmax.isEmpty()) return -1;
    	return maxEle;
    	
    	
    	
    }
    
    int popMax() {
    	if(stmax.isEmpty()) return -1;
    	int top = stmax.pop();
    	if(top <= maxEle) return top;
    	int temp = maxEle;
    	maxEle = (top - maxEle)/2;
    	return temp;
    	
    }
    void push(int x) {
    	if(stmax.isEmpty()) {
   		 stmax.push(x);
   		 maxEle=x;
   	 	}
    	else if(x<= maxEle) stmax.push(x);
    	else {
    		int ele = 2*maxEle + x;
    		stmax.push(ele);
    		maxEle = x;
    	}
    	
    }
    
    static void verticalTraversal(Node root,int step,Map<Integer,Queue<Integer>> map){
        if(root==null) return ;
        if(map.containsKey(step)) map.get(step).offer(root.data);
            //map.put(step,map.get(step).offer(root.data));
        else {
        	Queue<Integer> queue = new LinkedList<>();
        	queue.offer(root.data);
        	map.put(step,queue);
        }
        
//        verticalTraversal(root.left,step-1,map);
//        verticalTraversal(root.right,step+1,map);
    }
}
class Node{
	int data;
	int left;
	int right;
}


class parent{
	
	int height = 30;
	
	public void display(){
		System.out.print("From Parent");
	}
}


class child extends parent{
	
	int height = 40;

}





