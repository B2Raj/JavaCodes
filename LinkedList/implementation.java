import java.util.*;
import javax.print.attribute.standard.NumberOfDocuments;
public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList{
        Node head=null;
        Node tail=null;
        void insertNodeAtHead(int value){
            Node newNode=new Node(value);
            if(head==null){
                insertNodeAtEnd(value);
            } else{
                newNode.next=head;
                head=newNode;
            }
        }
        void insertNodeAtEnd(int value){
            Node newNode=new Node(value);
            if(head==null){
                head=newNode;
            } else{
                tail.next=newNode;
            }
            tail=newNode;
        }
        void insertNodeAtMiddle(int value,int posi){
            Node newNode=new Node(value);
            Node temp=head;
            if(posi==size()){
                insertNodeAtEnd(value);
                return;
            }
            else if(posi==0){
                insertNodeAtEnd(value);
                return;
            }
            for (int i=1; i<posi; i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+"->");
                    temp=temp.next;
                }
                System.out.print("null");
                System.out.println();
            }
            int size(){
                int count=0;
                Node temp=head;
                while(temp!=null){
                    count++;
                    temp=temp.next;
                }
                return count;
            }
        }
       
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        linkedList ll=new linkedList();
        ll.insertNodeAtEnd(4);
        ll.insertNodeAtEnd(2);
        ll.insertNodeAtEnd(5);
        ll.display();
        System.out.print(ll.size());
        System.out.println();
        ll.insertNodeAtEnd(6);
        ll.display();
        ll.insertNodeAtHead(42);
        ll.display();
        ll.insertNodeAtMiddle(23,4);
        ll.display();
        ll.insertNodeAtMiddle(33,2);
        ll.display();
    }
}