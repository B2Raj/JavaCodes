import java.util.*;
public class basics {
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
    public static void traverseRecursively(Node head){
        if(head==null){
            System.out.print("null");
            return;
        }
        System.out.print(head.data+"->");
        traverseRecursively(head.next);
    }
    public static void traverse(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            //this.next=null;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter linkedList data: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Node node1=new Node(a);
        Node node2=new Node(b);
        Node node3=new Node(c);
        node1.next=node2;
        node2.next=node3;
        node3.next=null;
        Node head=node1;
        // when we know the size of linked list then we can use for loop, but if we dont know the size of linkedList then we need to use while loop
        // System.out.println("Using for loop---->");
        // for (int i=1; i<=3; i++){
        //     System.out.print(temp.data+"->");
        //     temp=temp.next;
        // }
        // System.out.print("null");
        // System.out.println();

        /*System.out.println("Using while loop---->");
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");  */
        System.out.println("Using loop");
        traverse(node1);
        System.out.println();
        System.out.println("Using recursion");
        traverseRecursively(head);
        System.out.println();
        System.out.print("Length of list is: ");
        System.out.println(length(head));
    }
}
