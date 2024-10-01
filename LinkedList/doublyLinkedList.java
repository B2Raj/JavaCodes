import java.util.*;
public class doublyLinkedList{
    public static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static void display(node head){
        node temp=head;
        System.out.print("null<-");
        while(temp!=null){
            System.out.print(temp.data+"<=>");
            temp=temp.next;            
        }
        System.out.print("->null");
        System.out.println();
    }
    public static void insertAtHead(node head, int value){
        node newNode=new node(value);
        node temp=head;
        newNode.next=temp;
        temp.prev=newNode;
        temp=newNode;
        newNode.prev=null;
    }
    public static void main(String[] args){
        node node1=new node(3);
        node node2=new node(5);
        node node3=new node(2);
        node node4=new node(8);
        node node5=new node(9);
        node1.prev=null;
        node1.next=node2;
        node2.prev=node1;
        node2.next=node3;
        node3.prev=node2;
        node3.next=node4;
        node4.prev=node3;
        node4.next=node5;
        node5.prev=node4;
        node5.next=null;
        node head=node1;
        display(head);
        insertAtHead(head,19);
        display(node1);
    }
}