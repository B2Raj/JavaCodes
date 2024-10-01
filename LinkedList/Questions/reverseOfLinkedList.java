package Questions;
import java.util.*;
public class reverseOfLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void traverse(Node head){
        Node temp=head;
        if(temp==null){
            System.out.print("null");
            return;
        }
        System.out.print(temp.data+"->");
        traverse(temp.next);
    }
  /*   
 ---> if we wish to print the list in reverse order
    public static void traverse(Node head){
        Node temp=head;
        if(temp==null){
            System.out.print("null");
            return;
        }
        traverse(temp.next);
        System.out.print(temp.data+"->");
    }
        */
    public static void displayReverse(Node head){
        if(head==null){
            System.out.println();
            System.out.print("null");
            return;
        }
        displayReverse(head.next);
        System.out.print("<-"+head.data);
    }
    public static Node reverseAlgo(Node head){
        if(head.next==null){
            return head;
        }
        Node newHead=reverseAlgo(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;       
    }
    /*
    public static Node reverseList(Node head,int left,int right){
        Node temp1=head;
        Node temp2=head;
        int count=1;
        while(count<left){
            temp1=temp1.next;
            count++;
        }
        Node leftNode=temp1.next;
        while(count<right){
            temp2=temp2.next;
            count++;
        }
        Node rightNode=temp2.next;
        Node temp3=head;
        Node temp4=head;
        while(count<left){
            temp3=temp3.next;
            count++;
        }
        temp3.data=rightNode.data;
        while(count<right){
            temp4=temp4.next;
            count++;
        }
        temp3.data=leftNode.data;
        return head;
    } 
    */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node node1=new Node(1);
        Node node2=new Node(3);
        Node node3=new Node(6);
        Node node4=new Node(7);
        Node node5=new Node(9);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=null;
        Node head=node1;
        System.out.println("Origional linkedList: ");
        traverse(head);
        System.out.println();
        System.out.print("Reverse linkedList: ");
        displayReverse(head);
        System.out.println();
       // reverseList(head,3,5);
        traverse(head);
    }
}
