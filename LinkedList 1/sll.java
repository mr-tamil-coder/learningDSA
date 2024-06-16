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
     // add element using index
     void addUsingIndex(int e,int index) throws IndexOutOfBoundsException{
        try{
         if(index==0){
             addFirst(e);
         }else{
             Node temp=new Node(e);
             int count=0;
             Node curr=head;
             while(count < index-1){
                 curr=curr.next;
                 count++;
             }
             temp.next=curr.next;
             curr.next=temp;
         }
 
        }catch(Exception ee){
             throw new IndexOutOfBoundsException();
     }
     //add whole elments in linkedList
    void addAllElement(int[] arr){
        for (int element : arr) {
            add(element);
        }
    }
     //remove first element
     void removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
        }else if(head.next==null){
            head=null;
        }else if(head.next!=null){
            Node curr=head;
            head=head.next;
            curr.next=null;
        }
    }
    //remove last element
    void removeLast(){
        if(head==null){
            System.out.println("LinkedList is empty");
         }else if(head.next==null){
            head=null;
         }else if(head.next!=null){
            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
         }
    }
  }
 }
public class sll {
    
}
