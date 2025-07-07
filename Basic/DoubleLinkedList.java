import java.util.*;
class DoubleLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    public void add(int data){
        Node node=new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=node;
            node.prev=current;
        }
    }
    public void print(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println("null");
    }
    public void rev(){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String[] args){
        DoubleLinkedList list=new DoubleLinkedList();
        list.add(20);
        list.add(80);
        list.add(82);
        list.add(91);
        list.add(73);
        list.print();
        list.rev();
    }
}