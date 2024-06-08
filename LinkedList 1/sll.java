//to create a node of singly LinkedList
class Node{
    int data; 
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
 }

 
 class LinkedList{
    Node head;
    //to print the linkedList
    void printLinkedList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data +" ");
            curr=curr.next;
        }
    }
 }
public class sll {
    
}
