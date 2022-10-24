package LinkedList;

class DoublyLinkedList<T>{

    public DoubleNode head = null;
    public DoubleNode tail = null;
    int index = 0;

    public add(T data){
        index++;
        if(head==null){
            DoubleNode<T> node = new DoubleNode(data);
            head = tail = node;
        }else{
            DoubleNode<T> node = new DoubleNode(data);
            if(head.next ==null) head.next = node;
            tail.next = node;
            node.back = tail;
            tail = node;

        }
    }

    public T removeFromFront(){
        index--;
        if(head==null) return -1;
        T data = head.data;
        if(head.next == null) head = null;
        else{
            head = head.next;
            head.back = null;
        }
        return data;
    }

    public T removeFromBack(){
        index--;
        T data = tail.data;
        tail = tail.back;
        tail.next = null;
        return data;
    }

    public int size(){
        return index;
    }






    

}