package datastructures;

public class LinkedListImplementation {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(){

        }
    }
    LinkedListImplementation(){
        head=null;
    }
    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    public void insertAtPosition(int position,int data){
        if(position==0){
            insertAtBeginning(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=0;i<position;i++){
            temp=temp.next;
            if(temp==null){
                throw new IndexOutOfBoundsException("Invalid Position:"+position);
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void deleteAtBeginning(){
        if(head==null){
            throw new IndexOutOfBoundsException("Empty List!");
        }
        head=head.next;
    }
    public void deleteAtPosition(int position){
        if(head==null)
            throw new IndexOutOfBoundsException("Empty List!");
        if(position==0) {
            head = head.next;
            return;
        }
        Node temp=head;
        Node previous=null;
        for(int i=0;i<position;i++){
            previous=temp;
            temp=temp.next;
        }
        previous.next=temp.next;
    }
    public void reverse(){
        Node previous=null;
        Node current=head;
        Node next=head.next;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }

    public static void main(String[] args) {
        LinkedListImplementation l=new LinkedListImplementation();
        l.insertAtBeginning(10);
        l.insertAtBeginning(11);
        l.insertAtBeginning(12);
        l.insertAtBeginning(13);
        l.insertAtBeginning(14);
        l.insertAtBeginning(15);
        l.insertAtBeginning(16);
        l.display();
    }
}