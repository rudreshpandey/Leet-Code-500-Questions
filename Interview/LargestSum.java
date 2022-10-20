package Interview;

import java.util.*;

private class LargestSum {
	public static void connect(Node root)
	{ 
	   Queue<Node> qu = new LinkedList<>();
	  // if(root!=null)
	   qu.offer(root);
	   
	   while(!qu.isEmpty()){
	       int n=qu.size();
	       System.out.println(root);
	       System.out.println("n= "+n);
	       for(int i=1;i<=n;i++){
	           Node node = qu.poll();
	           if(i<n)
	           {
	        	   node.nextRight = qu.peek();
	        	   System.out.println( node.nextRight.data);
	           }
	           if(node.left!=null) qu.offer(node.left);
	           if(node.right!=null) qu.offer(node.right);
	           
	           System.out.println();
	           
	       }
	   }
	   
	}
	  
	public static void main (String args[]) {
		
		Queue<Node> q = new LinkedList<>();
		
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		node2.data=1;
		node3.data=2;
		node1.left=node2;
		node1.right=node3;
		node1.data=3;
		
		connect(node1);
		
		//for(int i=0;i<10;i++) System.out.println(arr[i]);
		
}}

class T{
public static void display(){
System.out.println("parent");
}

//class child extends T{
//public static void display(){
//	System.out.println("child");
//}

public class ExceptionTest {
	  public static void main(String[] args) {
	   System.out.println(exceptionTest());
	  }
	  public static int exceptionTest()
	  {
	   int i=6;
	   try{
	    throw new NullPointerException();
	   }
	   catch(NullPointerException e)
	   {
	    i=10;
	    throw e;
	   }
	   finally
	   {
	    i=20;
	    gfg g = new gfg();
	    System.out.println("In finally block");
	    return i;
	   }
	}
	}
class Node{
	int data;
	Node left;
	Node right;
	Node nextRight;
	
	

//0 0 1 0 2 0 2

}
}

abstract class gfg{
	static void ram() {
		
	}
}




