import java.util.*;
public class singlyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    static void insertNodeAtHead(Node head,int value){
        Node newNode=new Node(value);
        if(head==null){
            // head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    static void insertNodeAtEnd(Node head,int value){
        Node newNode=new Node(value);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=null;
    }
    static void insertNodeAtMiddle(Node head,int value,int posi){
        Node newNode=new Node(value);
        Node temp=head;
        if(posi==1){
            insertNodeAtHead(head,value);
            return;
        }
        int count=1;
        while(count<(posi-1)){
            temp=temp.next;
            count++;
        } 
        Node currentNode=temp.next;
        newNode.next=currentNode;
        temp.next=newNode;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 linkedList data: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        Node node1=new Node(a);
        Node node2=new Node(b);
        Node node3=new Node(c);
        Node node4=new Node(d);
        Node node5=new Node(e);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
        Node head=node1;
        traverse(head);
        insertNodeAtHead(head,4);
        traverse(head);
        insertNodeAtEnd(head,17);
        traverse(head);
        insertNodeAtEnd(head,45);
        traverse(head);
        insertNodeAtMiddle(head,27,3);
        traverse(head);
        insertNodeAtMiddle(head,77,7);
        traverse(head);
    }
}