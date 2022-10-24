package queue;
import LikedList;
import LikedList.SinglyLinkedList;
public class Queue {
   public static void main(String[] args) {
		
	}
   DoublyLinkedList<Integer> list = new DoublyLinkedList();
   public int poll(){
      list.removeFromFront();
   }

   public int peek(){
      if(head==null) return -1;
      else return head.data;
   }
    public add(int data){
      
    }

}
