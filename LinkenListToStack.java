import java.util.LinkedList;
import java.util.*;

public class LinkenListToStack {
	static Node head=null; 
	static class Node{
		Node next;
		int value;
		
		public Node(int a) {
			this.value=a;
			this.next=null;
		}
	}
	
	static Node push(int a) {
		if(head==null) {
			LinkenListToStack.Node node=new LinkenListToStack.Node(a);
			head=node;
		}else {
			LinkenListToStack.Node node=new LinkenListToStack.Node(a);
			node.next=head;
			head =node;
		}
		return head;
	}
	
	static int pop() {
		if(head==null) {
			return -1;
		}else {
			Node nodeNew=head;
			head=head.next;
			return nodeNew.value;
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkenListToStack.push(5);
		LinkenListToStack.push(6);
		LinkenListToStack.push(7);
		String str="abc";
		 int n=str.length();
	        int k=0;
	        //System.out.println(1<<n);
	        String [] arr=new String[1<<n];
	        List<String> list=new LinkedList<>();
//	        for(int num=0; num<(1<<n); num++){
//	            String temp="";
//	            for(int i=0; i<n; i++){
//	                //boolean a=num & (1<<i);
//	                //System.out.println(a);
//	                if((num & (1<<i))>0)
//	                temp+=str.charAt(i);
//	            }
//	            arr[k++]=temp;
//	        }
//	        sequence(str,"",list);
//	        int at=5;
//	        String ch=String.valueOf(at);
//	        System.out.println(ch);
//	        for(String st:list) System.out.println(st);
	        countRev("}{{}}{{{");
	 }
	
	static void sequence(String str,String ans,List<String> list) {
		if(str.isEmpty()) {
			if(!ans.isEmpty())list.add(ans);
		}
		else {
			sequence(str.substring(1),ans ,list);
			sequence(str.substring(1),ans+str.charAt(0),list);
		}
		System.out.println();
		
		
	}
	static int countRev (String s)
    {
        // your code here
        int n=s.length();
        if(n%2!=0) return -1;
        String str=s;
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            System.out.println(i);
            if(i==0 && s.charAt(0)=='}'){
               str='{'+s.substring(1);
               count++;
               i=0;
               System.out.println(str);
            }
            if(str.charAt(i)=='{' && str.charAt(i+1)=='}'){
                //count++;
                str=str.substring(0,i)+str.substring(i+2);
                i=0;
                System.out.println(count+" "+str);
            }
        }
        n=str.length();
        //if(n%2!=0) return -1;
        return (count+n/2);
    }

}
