package LikedList;

import java.util.Scanner;

public class Node {
	static Scanner sc = new Scanner(System.in);
	int data;
	Node next;
	Node(){
	}
	Node(int data){
		this.data = data;
		this.next = null;
	}
	
	public static Node makeList() {
		Node head = null;
		Node current = head;
		int n = sc.nextInt();
		while(n-->0){
			int data = sc.nextInt();
			if(head==null) {
				head = new Node(data);
				current = head;
			}
			else {
				current.next = new Node(data);
				current = current.next;
			}
		}
	}
	
}

