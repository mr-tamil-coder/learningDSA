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
    //to add data in linkedList
    void add(int e){
        Node temp=new Node(e);
        if(head==null){
            head=temp;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }
     // add element in the first node
     void addFirst(int e){
        Node temp=new Node(e);
        if(head==null){
            head=temp;
        }else{
           temp.next=head;
           head=temp;
        }
    }
 }
public class sll {
    
}
