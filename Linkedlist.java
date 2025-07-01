import java.util.*;
class Linkedlist{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
       
    }
     Node head=null;
    public static void main(String[] args){
        Linkedlist list=new Linkedlist();
      list.add(20);
      list.add(50);
      list.add(73);
      list.add(95);
      list.add(37);
      list.printlist();
    }
    public void add(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
        }
    }
    public void printlist(){
        Node current=head;
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
        System.out.println("null");
    }
}