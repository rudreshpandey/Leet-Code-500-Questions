package LikedList;

public class SinglyLinkedList {

	class Node{
		int data;
		Node next;
		Node(){
		}
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	
	Node addNewNode(int data) {
		if(head==null) return new Node(data);
		else {
			Node node = head;
			while(node.next!=null) node = node.next;
			node.next = new Node(data);
			return node;
		}
		
	}
	
}
		


