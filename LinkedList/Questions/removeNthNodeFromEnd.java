package Questions;
import org.w3c.dom.Node;
import java.util.*;
/* In this code, if we try to remove head then there will be error. so to overcome, we first make sure that we will check that fast node is null or not. */
public class removeNthNodeFromEnd {
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.print("null");
        System.out.println();
    }
    public static Node deleteNthFromEnd(Node head,int posi){
        Node slow=head;
        Node fast=head;
        for (int i=1; i<=posi; i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static class Node{
        int data; 
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
    Node a=new Node(3);
    Node b=new Node(2);
    Node c=new Node(5);
    Node d=new Node(9);
    Node e=new Node(159);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=null;
    Node head=a;
    display(head);
    a=deleteNthFromEnd(head,5);
    display(a);
    }
}