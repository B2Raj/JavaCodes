package Questions;
import java.util.*;
public class twoSumInDoublyLL{
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static void displayUsingTail(Node _tail){
        Node tail=_tail;
        while(tail.prev!=null){
            tail=tail.prev;
        }
        Node head=tail;
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void twoSumAlgo(Node head, int target){
        Node temp=head; // temp pointing head
        Node tail=head; // tail will point lastNode
        while(tail.next!=null){
            tail=tail.next;
        }
        while(temp.data<tail.data){
            if(temp.data+tail.data==target){
                System.out.print("Pair sum of target is: ");
                System.out.println("["+temp.data+","+tail.data+"]");
                break;
            }
            else if (temp.data+tail.data>target) {
                tail=tail.prev;
            } else{ //(temp.data+tail.data<target)
                temp=temp.next;
            }
        }
        if(temp.data+tail.data!=target){
            System.out.println("No pair");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 data for doubly linkedList: ");
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
        Node head=node1;
        Node tail=node5;
        display(head);
        displayUsingTail(tail);
        System.out.print("Enter a target: ");
        int target=sc.nextInt();
        twoSumAlgo(head,target);
    }
}