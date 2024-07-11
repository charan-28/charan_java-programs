import java.util.LinkedList;
class SLL{
    Node head;
    int size;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
}
public class linked_list {
    public static void main(String args[]){
        SLL rc = new SLL();
    }
}
