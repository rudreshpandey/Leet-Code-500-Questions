package interview;
//https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pairwise-swap-elements-of-a-linked-list-by-swapping-data
public class PairwiseSwapElementInLinkedList {
    public Node pairwiseSwap(Node head)
    {
        // code here
        
        Node node = head;
        if(node !=null && node.next!=null){
            Node temp = node.next;
            node.next = node.next.next;
            temp.next = node;
            head = temp;
        }
        Node last = node;
        node = node.next;
        while(node !=null && node.next!=null){
            Node temp = node.next;
            node.next = node.next.next;
            temp.next = node;
            last.next = temp;
            last = node;
            node = node.next;
            
        }
        return head;
    }
}

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
