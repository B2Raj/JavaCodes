
import java.util.*;
public class singlyLinkedList2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        //    this.next=null;
        }
    }
    public static class linkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            } System.out.print("Null");
            System.out.println();
        }
        void insertNodeAtHead(int value){
            Node newNode=new Node(value);
            Node temp=head;
            if(head==null){
                insertNodeAtEnd(value);
            } else{
                newNode.next=head;
                head=newNode;
            }
            size++;
        }
        void insertNodeAtMiddle(int value,int posi){
            Node temp=head;
            Node newNode=new Node(value);
            if(posi==1){
                insertNodeAtHead(value);
                return;
            }
            int count=1;
            while(count<(posi-1)){
                temp=temp.next;
                count++;
            }
                newNode.next=temp.next;
                temp.next=newNode;
            size++;
        }
        void insertNodeAtEnd(int value){
            Node temp=head;
            Node newNode=new Node(value);
            // while(temp.next!=null){
            //     temp=temp.next;
            // }
            // temp.next=newNode;
            // temp=newNode;
            if(head==null){
                head=newNode;
            } else{
                tail.next=newNode;
            }
            tail=newNode;
            size++;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        linkedList ll=new linkedList();
        ll.insertNodeAtHead(5);
        ll.display();
        ll.insertNodeAtHead(42);
        ll.display();
        ll.insertNodeAtHead(43);
        ll.display();
        ll.insertNodeAtEnd(13);
        ll.display();
        ll.insertNodeAtEnd(53);
        ll.display();
        // System.out.println(ll.head.data);
        // System.out.println(ll.tail.data);
        // System.out.println(ll.head.next.data);
        // System.out.println(ll.tail.next);
        ll.insertNodeAtMiddle(22,4);
        ll.display();
    }
}