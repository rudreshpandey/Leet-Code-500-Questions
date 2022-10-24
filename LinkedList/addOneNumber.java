package LikedList;

import java.util.Scanner;

public class addOneNumber {

	public static void main(String[] args) {
		
		
		current = head;
		printList(current);
		
		System.out.println();
		int addNum = sc.nextInt();
		int carry = add(head,addNum);
		while(carry>0) {
			int value = carry%10;
			Node node = new Node(value);
			node.next = head;
			head = node;
			carry /=10;
			
		}
		
		printList(head);
		
		
		
		
		
		
		

	}
	
	Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;

	}
	
	static int add(Node head, int num) {
		if(head==null) return num;
		else {
			int sum = head.data + add(head.next,num);
			head.data  = sum%10;
			int carry = sum/10;
			return carry;
		}
	}
	
	
	static void printList(Node head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}

}
